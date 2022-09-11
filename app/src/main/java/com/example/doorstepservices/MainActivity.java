package com.example.doorstepservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
       // getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        Button getStartedBtn;

        getStartedBtn=findViewById(R.id.button2);

        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,locationActivity.class);
                startActivity(intent);
            }
        });
    }
}