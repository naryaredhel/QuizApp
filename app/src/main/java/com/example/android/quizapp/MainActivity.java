package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGr1, radioGr2;
    CheckBox cbLiverpool,cbGlasgow, cbLeeds,cbSheffield;
    EditText name,answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name= findViewById(R.id.name_edit);
        radioGr1=findViewById(R.id.radioGr1);
        radioGr2=findViewById(R.id.radioGr2);
        cbGlasgow=findViewById(R.id.cbGlasgow);
        cbLiverpool=findViewById(R.id.cbLiverpool);
        cbSheffield =findViewById(R.id.cbSheffield);
        cbLeeds=findViewById(R.id.cbLeeds);
        answer4= findViewById(R.id.answer4);
    }

    public void SubmitButton(View view) {
        String userName=name.getText().toString();
        String mona= answer4.getText().toString();
        int points=0;
        if(radioGr1.getCheckedRadioButtonId() == R.id.radioSword){
            points+=5;
        }
        if (radioGr2.getCheckedRadioButtonId() == R.id.radioUranus){
            points+=5;
        }
        if (cbLiverpool.isChecked() && cbGlasgow.isChecked() && !cbSheffield.isChecked() && !cbLeeds.isChecked()){
            points+=5;
        }
        if (mona.equalsIgnoreCase("mona lisa")){
            points+=5;
        }
        Toast.makeText(this, userName+" Your score is: "+points, Toast.LENGTH_SHORT).show();
    }
}

