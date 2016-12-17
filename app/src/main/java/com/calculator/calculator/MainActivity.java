package com.calculator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mFirstNumEditText;
    EditText mSecondNumEditText;

    TextView mResultTextView;

    String oper = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstNumEditText = (EditText) findViewById(R.id.edit_text1);
        mSecondNumEditText = (EditText) findViewById(R.id.edit_text2);

        Button button_sum = (Button) findViewById(R.id.button1);
        button_sum.setOnClickListener(this);

        Button button_difference = (Button) findViewById(R.id.button2);
        button_difference.setOnClickListener(this);

        Button button_dobytok = (Button) findViewById(R.id.button3);
        button_dobytok.setOnClickListener(this);

        Button button_devision = (Button) findViewById(R.id.button4);
        button_devision.setOnClickListener(this);

        mResultTextView = (TextView) findViewById(R.id.text_view);
    }

    @Override
    public void onClick(View view) {

            float firstNum1 = getFirstNum();
            float secondNum2 = getSecondNum();
            float result = 0;



        switch(view.getId()) {
            case R.id.button1:
                    oper ="+";
                    result = firstNum1+secondNum2;
                    break;
            case R.id.button2:
                    oper = "-";
                    result = firstNum1-secondNum2;
                    break;
            case R.id.button3:
                    oper = "*";
                    result = firstNum1*secondNum2;
                    break;
            case R.id.button4:
                    oper = "/";
                    result = firstNum1/secondNum2;
                    break;
                default:
                    break;
            }
            mResultTextView.setText( firstNum1 + " " + oper + " " + secondNum2 + " = " + result);

        }
    private float getFirstNum() {
        String number = mFirstNumEditText.getText().toString().trim();
        if (number.isEmpty())
        {
            return 0;
        }
        else
        {
            return Float.parseFloat(number);
        }
    }

        private float getSecondNum() {
            String number = mSecondNumEditText.getText().toString().trim();
            if(number.isEmpty())
            {
                return 0;
            }
            else
            {
                return Float.parseFloat(number);
            }

        }
    }

