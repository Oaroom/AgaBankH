package com.ghen61.agabankh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by LG on 2018-06-13.
 */

public class SendActivity extends AppCompatActivity {

    Button button1;
    EditText name;
    EditText acc;
    EditText money;
    Spinner spinner;

    Intent intent = null;

    /*
    * jsp에서의 getParameter와 비슷
    *
    * Intent intent = getIntent();
    *
    *
    * String data = intent.getStringExtra("value");
    * */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_send);

        button1=(Button)findViewById(R.id.submit);
        name=(EditText)findViewById(R.id.name);
        acc=(EditText)findViewById(R.id.acc);
        money=(EditText)findViewById(R.id.money);
        spinner=(Spinner)findViewById(R.id.spinner);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent = new Intent(SendActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}