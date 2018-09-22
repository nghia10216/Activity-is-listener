package com.bk.ducnghia.event3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tong = findViewById(R.id.text_tong);
        tong.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText edta=findViewById(R.id.text_a);
        Integer a=Integer.parseInt(edta.getText()+"");
        EditText edtb=findViewById(R.id.text_b);
        Integer b=Integer.parseInt(edtb.getText()+"");
        TextView tong=findViewById(R.id.text_da);
        tong.setText((a+b)+"");
    }
}