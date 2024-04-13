package com.example.a6a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class New extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv1 = findViewById(R.id.tv1);
        String name = getIntent().getStringExtra("name");
        tv1.setText("Hello " + name);
    }
}
