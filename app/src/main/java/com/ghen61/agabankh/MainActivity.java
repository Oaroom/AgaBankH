package com.ghen61.agabankh;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;

    Intent intent = null;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list);
        button = (Button)findViewById(R.id.test);


        listAdapter = new ListAdapter();


        listAdapter.addItem("1111111111","50,000","1,000","50,000");
        listAdapter.addItem("2222222222","40,000","1,400","20,000");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(MainActivity.this,SendActivity.class);
                startActivity(intent);

            }
        });




        /*
        *
        * intent.putExtra("value","문자열");
        *
        * */

        listView.setAdapter(listAdapter);
    }
}
