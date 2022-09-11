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

public class CallActivity extends AppCompatActivity {
     private static final int REQUEST_CALL=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        Button callbtn;
        callbtn=findViewById(R.id.button21);

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="8870783697";
                if(ContextCompat.checkSelfPermission(CallActivity.this, Manifest.permission.CALL_PHONE)!=
                        PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(CallActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
                }else{
                    String dial="tel:"+"8870783697";
                    startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
                }

            }

        });
    }
}