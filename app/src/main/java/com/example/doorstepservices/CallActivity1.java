package com.example.doorstepservices;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallActivity1 extends AppCompatActivity {
    private static final int REQUEST_CALL=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call1);

        Button callbtn;
        callbtn=findViewById(R.id.button31);

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="9363125316";
                if(ContextCompat.checkSelfPermission(CallActivity1.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(CallActivity1.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else{
                    String dial="tel:"+"9363125316";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }

            }

        });
    }
}