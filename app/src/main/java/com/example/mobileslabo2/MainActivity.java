package com.example.mobileslabo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText edit_name, edit_pass;
    private TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.Btn1);
        edit_name = findViewById(R.id.User_text);
        edit_pass = findViewById(R.id.Pass_text);
        text1 = findViewById(R.id.Text1);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                text1.setText(edit_name.getText());
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                text1.setText(edit_pass.getText());
                return false;
            }
        });

    }
}
