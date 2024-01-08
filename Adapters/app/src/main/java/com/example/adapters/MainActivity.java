package com.example.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.adapters.adapters.PersonAdapter;
import com.example.adapters.models.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static final int ADD_REQUEST_CODE = 1;

    /*Integer[] imagesIds = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven
    };*/

//    List<Person> people = new ArrayList<>();
    PersonAdapter personAdapter;
    ListView listView;

   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (data != null && resultCode == 200) {
            if (requestCode == ADD_REQUEST_CODE) {
               String fullName = data.getStringExtra("fullName");
               Integer age = data.getIntExtra("age", 0);
                Toast.makeText(MainActivity.this, fullName + "\n" + age, Toast.LENGTH_LONG).show();
                people.add(new Person(fullName, age, R.drawable.two));
                personAdapter.notifyDataSetChanged();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.btn_add);
        Button editBtn = findViewById(R.id.btn_edit);
        Button removeBtn = findViewById(R.id.btn_remove);
        Button clearBtn = findViewById(R.id.btn_clear);

        listView = findViewById(R.id.list_view);

        /*people.add(new Person("John Doe", 25, R.drawable.one));
        people.add(new Person("Jane Doe", 26, R.drawable.two));
        people.add(new Person("Jack Smith", 27, R.drawable.three));
        people.add(new Person("Jill Cherkasov", 28, R.drawable.four));
        people.add(new Person("Joe Mashkov", 29, R.drawable.five));
        people.add(new Person("Jen Lie", 30, R.drawable.six));
*/

        ArrayList<HashMap<String, Object>> data = new ArrayList<>();

        HashMap<String, Object> item = new HashMap<>();
        item.put("fullName", "Vladimir Vinnik");
        item.put("age", 42);
        item.put("avatar", R.drawable.two);
        item.put("Java", true);
        data.add(item);
        HashMap<String, Object> item2 = new HashMap<>();
        item2.put("fullName", "John Doe");
        item2.put("age", 25);
        item2.put("avatar", R.drawable.one);
        item2.put("Java", false);
        data.add(item2);
        HashMap<String, Object> item3 = new HashMap<>();
        item3.put("fullName", "Oleg Noskov");
        item3.put("age", 35);
        item3.put("avatar", R.drawable.three);
        item3.put("Java", true);
        data.add(item3);
        HashMap<String, Object> item4 = new HashMap<>();
        item4.put("fullName", "Evgeniy Strokov");
        item4.put("age", 22);
        item4.put("avatar", R.drawable.five);
        item4.put("Java", false);
        data.add(item4);

        String[] keys = {"fullName", "age", "avatar", "Java"};
        int[] ids = {R.id.text_fullname, R.id.text_age, R.id.img_avatar, R.id.checkbox};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, data, R.layout.person_item, keys, ids);
        listView.setAdapter(simpleAdapter);


//        personAdapter = new PersonAdapter(this, R.layout.person_item, people);
//        listView.setAdapter(personAdapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivityForResult(intent, ADD_REQUEST_CODE);
            }
        });

       /* clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (people != null && people.size() > 0) {
                    people.clear();
                    personAdapter.notifyDataSetChanged();
                }
            }
        });*/

        /*ViewPager viewPager = findViewById(R.id.view_pager);
        ImagePagerAdapter adapter = new ImagePagerAdapter(this);
        viewPager.setAdapter(adapter);*/

        /*ImageView imageView = findViewById(R.id.image_one);
        Gallery gallery = findViewById(R.id.gallery_one);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, imagesIds[position].toString(), Toast.LENGTH_LONG).show();
                imageView.setImageResource(imagesIds[position]);
            }
        });*/
    }

    /*class ImagePagerAdapter extends PagerAdapter {

        private Context context;

        public ImagePagerAdapter(Context context) {
            this.context = context;
        }

        Integer[] imagesIds = {
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven
        };

        @Override
        public int getCount() {
            return imagesIds.length;
        }
        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            ImageView imageView = new ImageView(context);
            int padding = 20;
            imageView.setPadding(padding, padding, padding, padding);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageResource(imagesIds[position]);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((ImageView) object);
        }
    }*/



        /*class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;

        public ImageAdapter(Context context) {
            this.context = context;
            TypedArray array = context.obtainStyledAttributes(R.styleable.MyGallery);
            itemBackground = array.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
            array.recycle();

        }

        @Override
        public int getCount() {
            return imagesIds.length;
        }

        @Override
        public Object getItem(int position) {
            return imagesIds[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imagesIds[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }*/
}
