package com.example.menuwithicon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      MenuInflater menuInflater = getMenuInflater();
      menuInflater.inflate(R.menu.menu_w_icon,menu);
      return super.onCreateOptionsMenu(menu);
   }

   //whenever the item is selected, display something, using Toast.makeText

   @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {

      switch (item.getItemId()){
         case R.id.macy_res:
            Toast.makeText(this,"Camera is selected",Toast.LENGTH_SHORT).show(); break;
         case R.id.hon_res:
            Toast.makeText(this,"Laptop is selected",Toast.LENGTH_SHORT).show(); break;
         case R.id.more:
            Toast.makeText(this,"",Toast.LENGTH_SHORT).show(); break;
         case R.id.plane:
            Toast.makeText(this,"Plane Ken is selected",Toast.LENGTH_SHORT).show(); break;
         case R.id.dolla:
            Toast.makeText(this,"$ Macy is selected",Toast.LENGTH_SHORT).show(); break;
         case R.id.happyface:
            Toast.makeText(this,"Happy_face Hon is selected",Toast.LENGTH_SHORT).show(); break;
         default:
            return super.onOptionsItemSelected(item);
      }
      return true;
   }
}