package com.example.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        textView = findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1
                new LongDuration().execute(textView);

                //2
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String data = getData();
                        textView.setText(data);

                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                textView.setText(data);
                            }
                        });
                    }
                });
//                thread.start();
            }
        });
    }

    //<currency>
    //<r030>36</r030>
    //<txt> Австралійський долар</txt>
    //<rate>24.7452</rate>
    //<cc>AUD</cc>
    //<exchangedate>22.01.2024</exchangedate>
    //</currency>

    class LongDuration extends AsyncTask<Object, Void, String> {
        TextView textView;

        @Override
        protected String doInBackground(Object... objects) {
            textView = (TextView) objects[0];
            String data = getData();
            return data;
        }

        @Override
        protected void onPostExecute(String s) {
            textView.setText(s);
        }
    }

    private String getData() {
        try {
            Log.i("Test", "getData: 1" );
            URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");
            Log.i("Test", "getData: 1.1" );
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Log.i("Test", "getData: 1.2" );
            DocumentBuilder db = dbf.newDocumentBuilder();
            Log.i("Test", "getData: 1.3" );
            Document document = db.parse(url.openStream());
            Log.i("Test", "getData: 1.4" );
            document.getDocumentElement().normalize();
            Log.i("Test", "getData: 2" );
            NodeList list = document.getElementsByTagName("currency");
            Log.i("Test", "getData: 3" );
            StringBuilder stringBuilder = new StringBuilder(100);
            Log.i("Test", "getData: 4" );
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                Element element = (Element) node;
                String code = element.getElementsByTagName("cc").item(0).getFirstChild().getNodeValue();
                if (code.equals("AUD") || code.equals("CAD") ||
                code.equals("JPY") || code.equals("ILS") ||
                code.equals("AUD") || code.equals("INR") ||
                code.equals("AZN") || code.equals("RUB") ||
                code.equals("DKK") || code.equals("CAD")) {
                    String rate = element.getElementsByTagName("rate").item(0).getFirstChild().getNodeValue();
                    stringBuilder.append(code + " : " + rate + "\n");
                }
            }
            Log.i("Test", "getData: 5" );
            return stringBuilder.toString();
        } catch (Exception e) {
            Log.i("Test", "getData: 8 " + e.getMessage());
            e.printStackTrace();
        }
        return "Vladimir";
    }
}