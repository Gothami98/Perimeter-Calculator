package edu.cinec.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {


    EditText input3;
    Button btn;
    TextView text_3,text_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        input3 = findViewById(R.id.input3);
        btn=findViewById(R.id.btn);
        text_3=findViewById(R.id.text_3);
        text_4 = findViewById(R.id.text_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float con = Float.parseFloat(input3.getText().toString());
                float ans = 2*22/7*con;
                text_4.setText("Answer: "+ans);

            }
        });
    }
}
