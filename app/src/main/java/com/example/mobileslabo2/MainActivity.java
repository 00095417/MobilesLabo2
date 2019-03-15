package com.example.mobileslabo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private Button btn = findViewById(R.id.btn1);
    private TextView text1 = findViewById(R.id.text1);
    private EditText edit1 = findViewById(R.id.user_name1);
    private EditText edit2 = findViewById(R.id.pass);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = findViewById(R.id.ll_1);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(edit1.getText());
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {
                text1.setText(edit2.getText());
                return false;
            }
        });

    }
}
