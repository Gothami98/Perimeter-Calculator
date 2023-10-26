package edu.cinec.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    EditText inputW,inputH;
    Button btn;
    TextView text_2,text_3,text_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        inputW = findViewById(R.id.inputW);
        inputH = findViewById(R.id.inputH);
        btn=findViewById(R.id.btn);
        text_2=findViewById(R.id.text_2);
        text_3=findViewById(R.id.text_3);
        text_4=findViewById(R.id.text_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float con = Float.parseFloat(inputW.getText().toString());
                float con1 = Float.parseFloat(inputH.getText().toString());
                float ans = 2*(con+con1);

                text_4.setText("Answer: "+ans);

            }
        });


    }

}
