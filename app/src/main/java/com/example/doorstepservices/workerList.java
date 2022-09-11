package com.example.doorstepservices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class workerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_list);

        CardView cv1,cv2;
         cv1=findViewById(R.id.card11);
         cv2=findViewById(R.id.card13);

         cv1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent=new Intent(workerList.this,CallActivity.class);
                 startActivity(intent);
             }
         });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(workerList.this,CallActivity1.class);
                startActivity(intent);
            }
        });
    }
}