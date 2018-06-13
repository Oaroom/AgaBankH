package com.ghen61.agabankh;

import android.content.Intent;
import android.media.MediaExtractor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LG on 2018-06-13.
 */

public class LoginActivity extends AppCompatActivity {


    EditText idEdit;
    EditText pwEdit;
    Button submit;
    TextView singup;
    Intent login = null;

    //사용자가 입력한 아이디와 비밀번호
    String id;
    String pw;


    //DB에서 확인을 위한 아이디와 비밀번호
    String idDB = "hello";
    String pwDB = "world";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);


        idEdit = (EditText)findViewById(R.id.id);
        pwEdit = (EditText)findViewById(R.id.pw);

        submit = (Button)findViewById(R.id.loginB);
        singup = (TextView)findViewById(R.id.singup);



        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                login = new Intent(LoginActivity.this,SignupActivity.class);


                startActivity(login);
                finish();


            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                id = idEdit.getText().toString();
                pw = pwEdit.getText().toString();
                Toast.makeText(LoginActivity.this, id+"/"+pw+"/"+idDB+"/"+pwDB, Toast.LENGTH_SHORT).show();



                if(id.equals(idDB) && pw.equals(pwDB)){

                    Toast.makeText(LoginActivity.this, "로그인성공!", Toast.LENGTH_SHORT).show();


                    login = new Intent(LoginActivity.this,MainActivity.class);
                    login.putExtra("loginID",id);

                    startActivity(login);
                    finish();




                }else{


                    Toast.makeText(LoginActivity.this, "로그인실패!", Toast.LENGTH_SHORT).show();



                }

            }
        });

    }
}
