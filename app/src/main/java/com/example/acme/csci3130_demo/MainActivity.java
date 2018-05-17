package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(vo);

    }

    View.OnClickListener vo = new View.OnClickListener() {

        @Override
        public void onClick(View view) {


            EditText et = (EditText) findViewById(R.id.editText);
            TextView tv = (TextView) findViewById(R.id.textView);

            tv.setText(et.getText().toString());
        }
    };

}
