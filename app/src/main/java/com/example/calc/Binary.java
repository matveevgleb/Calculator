package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.Selection;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Binary extends AppCompatActivity {
    private Switch Hex, Oct, Dec;
    private int calc = 0;
    EditText numberField, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        numberField = (EditText) findViewById(R.id.numberField);
        textView2 = (EditText) findViewById(R.id.suka);
        numberField.setInputType(InputType.TYPE_NULL);
        textView2.setInputType(InputType.TYPE_NULL);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    public void onClick2(View v) {
        Intent intent = new Intent(Binary.this, com.example.calc.Programmer.class);
        startActivity(intent);
        finish();
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick1(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        Button button = (Button) view;
        string = (String) button.getText().toString();
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        if (string.contains("0") || string.contains("1")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        }
        if (numberField.length() > 20) {
            Toast.makeText(this, "?????????? ???????????? ???? 15 ????????", Toast.LENGTH_SHORT).show();
        } else if (numberField.requestFocus()) {
            numberField.setText(numberField.getText().toString() + string);
        }
    }

    public void onClick3(View view) {
        final EditText col = (EditText) findViewById(R.id.textView2);//????????
        Button button = (Button) view;
        string = (String) button.getText().toString();
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        if (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7") || string.contains("8") || string.contains("9")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        }
        if (col.requestFocus()) {
            col.setText(col.getText().toString() + string);
        }
    }


    public void onClick(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);//????????
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        int c = arrayList.size();
        if (Dec.isChecked() && Oct.isChecked() && Hex.isChecked()) {
            Toast.makeText(this, "???????????????? ???????????? ???????? ??????????????", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            Oct.setClickable(false);
            Hex.setChecked(false);
            Dec.setChecked(false);
        } else if (Oct.isChecked() && Hex.isChecked() || Oct.isChecked() && Dec.isChecked() || Dec.isChecked() && Hex.isChecked()) {
            Toast.makeText(this, "???????????????? ???????????? ???????? ??????????????", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            Oct.setClickable(false);
            Hex.setChecked(false);
            Dec.setChecked(false);
        } else if (Oct.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                calc = Integer.parseInt(arrayList.get(0), 2);
                resultField.setText(Integer.toOctalString(calc));
            }
        } else if (Dec.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                calc = Integer.parseInt(arrayList.get(0), 2);
                resultField.setText(Integer.toString(calc));
            }
        } else if (Hex.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                calc = Integer.parseInt(arrayList.get(0), 2);
                resultField.setText(Integer.toHexString(calc));
            }
        } else if (arrayList.isEmpty()) {
            resultField.setText("0");
        }
    }




    public void onClear1(View view) {
        EditText col = (EditText) findViewById(R.id.textView2);//????????
        col.setText("");
    }

    public void onClear(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        EditText col = (EditText) findViewById(R.id.textView2);
        string = "";
        string1 = "";
        resultField.setText("");
        numberField.setText("");
        col.setText("");
        arrayList.clear();
        Oct.setChecked(false);
        Hex.setChecked(false);
        Dec.setChecked(false);
    }
}