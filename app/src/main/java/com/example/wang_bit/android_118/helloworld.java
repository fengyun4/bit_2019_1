package com.example.wang_bit.android_118;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class helloworld extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_first);

        Button btn1=findViewById(R.id.btn1);
        ImageView img=findViewById(R.id.img1);
        EditText edt=findViewById(R.id.input1);
        ProgressBar pb=findViewById(R.id.pb1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(helloworld.this,"you have clicked on it",Toast.LENGTH_SHORT).show();
            }
        });


        Log.d("btn1","now it don't have bug");
        Log.e("input1","it is low now");
    }
}