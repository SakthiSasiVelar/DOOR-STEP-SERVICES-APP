package com.example.doorstepservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class locationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location2);

        Spinner spinner;
        Button button;
        String[] location;

        location=getResources().getStringArray(R.array.area);
        spinner=findViewById(R.id.spinner3);
        button=findViewById(R.id.button2);

        ArrayAdapter adapter=new ArrayAdapter(locationActivity.this, R.layout.my_dropdown_item,location);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item );
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected=spinner.getSelectedItem().toString();

                if(selected.equals("Somanur")){
                    Intent intent=new Intent(locationActivity.this,WorkActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}