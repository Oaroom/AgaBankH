package com.ghen61.agabankh;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.list);
        listAdapter = new ListAdapter();


        listAdapter.addItem("1111111111","50,000","1,000","50,000");
        listAdapter.addItem("2222222222","40,000","1,400","20,000");


        listView.setAdapter(listAdapter);
    }
}
