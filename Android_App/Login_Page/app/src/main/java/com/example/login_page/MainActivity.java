package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn[] = new Button[2];
    int btn_id[] = {R.id.Login_Btn, R.id.Sign_Btn};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < btn.length; i++){
            btn[i] = (Button) findViewById(btn_id[i]);
            btn[i].setOnClickListener(a->{
                Button me = (Button)a;
                if(me.getText().toString().equals("회원가입")) {
                    Intent intent = new Intent(this, Sign_Page.class);
                    startActivity(intent);
                }
            });
        }
    }
}