package com.example.countapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    int a=0;
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.count_inc);
        tv=findViewById(R.id.text_count);

        if (savedInstanceState!=null){
            String s=savedInstanceState.getString("number");
            tv.setText(s);
        }else {
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    a++;
                    tv.setText(""+a);
                }
            });

        }
    }
    public void toast(View view) {
        Toast.makeText(this, "Android",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("number",tv.getText().toString());
    }
}
