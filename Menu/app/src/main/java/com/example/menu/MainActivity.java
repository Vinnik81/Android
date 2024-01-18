package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);

        SubMenu subMenuFile = menu.addSubMenu("File");
        subMenuFile.add(Menu.NONE, 11, Menu.NONE, "New");
        subMenuFile.add(Menu.NONE, 12, Menu.NONE, "Open");
        subMenuFile.add(Menu.NONE, 13, Menu.NONE, "Save");
        subMenuFile.add(Menu.NONE, 14, Menu.NONE, "Close");

        SubMenu subMenuEdit = menu.addSubMenu("Edit");
        subMenuEdit.add(Menu.NONE, 11, Menu.NONE, "Cut");
        subMenuEdit.add(Menu.NONE, 12, Menu.NONE, "Copy");
        subMenuEdit.add(Menu.NONE, 13, Menu.NONE, "Past");

       MenuItem view = menu.add(Menu.NONE, 3, Menu.NONE, "View");
       view.setCheckable(true);
       view.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(@NonNull MenuItem menuItem) {
               menuItem.setChecked(!menuItem.isChecked());
               return true;
           }
       });

        menu.add(Menu.NONE, 4, Menu.NONE, "Help");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_edit) {
            Toast.makeText(this, "Edit", Toast.LENGTH_LONG).show();
        } else if (id == R.id.action_file) {
            Toast.makeText(this, "File", Toast.LENGTH_LONG).show();
        } else if (id == R.id.action_help) {
            Toast.makeText(this, "Help", Toast.LENGTH_LONG).show();
        } else if (id == R.id.action_view) {
            Toast.makeText(this, "View", Toast.LENGTH_LONG).show();
        }
            return super.onOptionsItemSelected(item);
    }

    public void onClickTest(MenuItem item) {
        Toast.makeText(this, "Click", Toast.LENGTH_LONG).show();
    }
}