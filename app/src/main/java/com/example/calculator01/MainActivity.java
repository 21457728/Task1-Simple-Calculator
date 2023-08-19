package com.example.calculator01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

   Button button_Add,button_Sub,button_mul,button_div;
   EditText editTextN1,editTextN2;
   TextView textView;
   int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_Add = findViewById(R.id.button_add);
        button_Sub = findViewById(R.id.button_sub);
        button_mul = findViewById(R.id.button_mul);
        button_div = findViewById(R.id.button_div);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);
        button_Add.setOnClickListener(this);
        button_Sub.setOnClickListener(this);
        button_mul.setOnClickListener(this);
        button_div.setOnClickListener(this);
    }
    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().equals("")){
            Toast.makeText(this, "Enter Number", Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());

    }

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);

        int id = view.getId();
        if (id == R.id.button_add) {
            textView.setText("Answer : " + (num1 + num2));
        } else if (id == R.id.button_sub) {
            textView.setText("Answer : " + (num1 - num2));
        } else if (id == R.id.button_mul) {
            textView.setText("Answer : " + (num1 * num2));
        } else if (id == R.id.button_add) {
            textView.setText("Answer : " + ((float) num1 / (float) num2));
        }


    }
}