package com.example.kafeteriacoffeina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TopLevelActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level_acticity);

        ListView listView = (ListView) findViewById(R.id.list_options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0){
                    Toast toast = Toast.makeText(getApplicationContext(), "First position clicked", Toast.LENGTH_SHORT);
                    toast.show();

                    Intent intentDrink = new Intent(TopLevelActicity.this, DrinkCategoryActivity.class);
                    intentDrink.putExtra(DrinkCategoryActivity.EXTRA_DRINKID, (int) id);
                    startActivity(intentDrink);
                }

                if(position == 1){
                    Toast toast = Toast.makeText(getApplicationContext(), "Second position clicked", Toast.LENGTH_SHORT);
                    toast.show();
                }

                if(position == 2){
                    Toast toast = Toast.makeText(getApplicationContext(), "Third position clicked", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        };

        listView.setOnItemClickListener(itemClickListener);


    }
}