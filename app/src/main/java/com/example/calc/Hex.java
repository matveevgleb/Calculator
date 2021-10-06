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
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Hex extends AppCompatActivity {
    private Switch Hex, Oct, Dec;
    EditText numberField, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hex);
        numberField = (EditText) findViewById(R.id.numberField);
        textView2 = (EditText) findViewById(R.id.textView);
        numberField.setInputType(InputType.TYPE_NULL);
        textView2.setInputType(InputType.TYPE_NULL);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(Hex.this, com.example.calc.Programmer.class);
        startActivity(intent);
        finish();
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick1(View view) {
        EditText numberField = (EditText) findViewById(R.id.numberField);
        Button button = (Button) view;
        string = (String) button.getText().toString();
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        if (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4")
                || string.contains("5") || string.contains("6") || string.contains("7") || string.contains("8") || string.contains("9")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        }
        if (numberField.length() > 20) {
            Toast.makeText(this, "Up to 20 digits can be entered ", Toast.LENGTH_SHORT).show();
        } else if (numberField.requestFocus()) {
            numberField.setText(numberField.getText().toString() + string);
        }
    }

    public void onClick3(View view) {
        EditText col = (EditText) findViewById(R.id.textView);
        Button button = (Button) view;
        string = (String) button.getText().toString();
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        if (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3")
                || string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7")
                || string.contains("8") || string.contains("9")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        }
        if (numberField.length() > 20) {
            Toast.makeText(this, "\n" +
                    "Можно ввести до 20 цифр. ", Toast.LENGTH_SHORT).show();
        } else if (col.requestFocus()) {//Переход rкурсора
            col.setText(col.getText().toString() + string);
        }
    }



    public void onClick(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        int c = arrayList.size();
        if (Dec.isChecked() && Oct.isChecked() && Hex.isChecked()) {
            Toast.makeText(this, "Выберите только один вариант", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            Oct.setClickable(false);
            Hex.setChecked(false);
            Dec.setChecked(false);
        } else if (Oct.isChecked() && Hex.isChecked() || Oct.isChecked() && Dec.isChecked() || Dec.isChecked() && Hex.isChecked()) {
            Toast.makeText(this, "Выберите только один вариант", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            Oct.setClickable(false);
            Hex.setChecked(false);
            Dec.setChecked(false);
        } else if (Oct.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                String v = numberField.getText().toString();
                long decimal = Long.parseLong(v, 16);
                resultField.setText(Long.toOctalString(decimal));
            }
        } else if (Dec.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                String va = numberField.getText().toString();
                long decimal = Long.parseLong(va, 16);
                resultField.setText(Long.toBinaryString(decimal));
            }
        } else if (Hex.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                String val = numberField.getText().toString();
                long decimal = Long.parseLong(val, 16);
                resultField.setText(Long.toString(decimal));
            }
        } else if (arrayList.isEmpty()) {
            resultField.setText("0");
        }
    }






    public void onClear1(View view) {
        EditText col = (EditText) findViewById(R.id.textView);
        col.setText("");
    }

    public void onClear(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        EditText col = (EditText) findViewById(R.id.textView);
        string = "";
        string1 = "";
        col.setText("");
        resultField.setText("");
        numberField.setText("");
        arrayList.clear();
    }
}