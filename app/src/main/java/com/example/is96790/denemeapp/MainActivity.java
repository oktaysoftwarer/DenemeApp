package com.example.is96790.denemeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button basbutton=(Button)findViewById(R.id.basButton);
        final TextView basTextview=(TextView)findViewById(R.id.basTextView);
        basbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    basTextview.setText("Oktay");
            }
        });
    }
}
