package com.ghen61.agabankh;

import android.Manifest;
import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListAdapter.ListBtnClickListener{



    Intent intent = null;
    Intent Main;

    TextView name;


    //사용자의 아이디가 들어가있는 변수. 백엔드 친구들 이걸 사용하세요!!
    String userID;

    ImageButton setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (TextView)findViewById(R.id.name);



        //login 페이지에서 값을 받아와서 넘김
        Main=getIntent();
        userID  = Main.getStringExtra("loginID");
        name.setText(userID+"님");

        setting = (ImageButton)findViewById(R.id.setting);



        ListView listView;
        ListAdapter listAdapter;
        ArrayList<ListViewItem> items = new ArrayList<ListViewItem>();


      //  loadItemsFrom(items);


        listAdapter = new ListAdapter(this,R.layout.layout_item,items,this);


        listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        listAdapter.addItem("1111111111","50,000","1,000","50,000");
        listAdapter.addItem("2222222222","40,000","1,400","20,000");


        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(MainActivity.this,SettingActivity.class);
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
/*
    private  boolean loadItemsFrom(ArrayList<ListViewItem> list) {


        ListViewItem item;

        int i;

        if (list == null) {

            list = new ArrayList<ListViewItem>();

            i = 1;

            item = new ListViewItem();
            item.setAccount("21111-11111");
            item.setMoney("1");
            item.setOnetime("5");
            item.setMonth("4");
            i++;

            list.add(item);

        }
        return true;
    }
*/

    @Override
    public void onListBtnClick(String type){

            String values[] = type.split("/");


            switch (values[0]){

                case "show": intent = new Intent(MainActivity.this, ShowActivity.class);
                                intent.putExtra("acc",String.valueOf(values[1]));
                             startActivity(intent); break;

                case "send": intent = new Intent(MainActivity.this, SendActivity.class);
                    intent.putExtra("acc",String.valueOf(values[1]));
                             startActivity(intent); break;


            }
    }
}

