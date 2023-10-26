package edu.cinec.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {


    EditText input3,input4,input5;
    Button btn;
    TextView text_3,text_4,text_5,text_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        btn=findViewById(R.id.btn);
        text_3=findViewById(R.id.text_3);
        text_4 = findViewById(R.id.text_4);
        text_5 = findViewById(R.id.text_5);
        text_7 = findViewById(R.id.text_7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float con = Float.parseFloat(input3.getText().toString());
                float con1 = Float.parseFloat(input4.getText().toString());
                float con2 = Float.parseFloat(input5.getText().toString());
                float ans = con+con2+con1;
                text_7.setText("Answer: "+ans);

            }
        });
    }
}