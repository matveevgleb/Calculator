package com.example.calc;



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

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Octal extends AppCompatActivity {
    private Switch Hex, Oct, Dec;
    EditText numberField, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal);
        numberField = (EditText) findViewById(R.id.numberField);
        textView2 = (EditText) findViewById(R.id.suka);
        numberField.setInputType(InputType.TYPE_NULL);
        textView2.setInputType(InputType.TYPE_NULL);
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(Octal.this, com.example.calc.Programmer.class);
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
        if (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        }
        if (numberField.length() > 20) {
            Toast.makeText(this, "Можно ввести до 15 цифр", Toast.LENGTH_SHORT).show();
        } else if (numberField.requestFocus()) {
            numberField.setText(numberField.getText().toString() + string);
        }
    }

    public void onClick3(View view) {
        textView2 = (EditText) findViewById(R.id.suka);
        Button button = (Button) view;
        string = (String) button.getText().toString();
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        if (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") || string.contains("6") || string.contains("7")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        }
        if (numberField.length() > 20) {
            Toast.makeText(this, "Можно ввести до 15 цифр", Toast.LENGTH_SHORT).show();
        } else if (textView2.requestFocus()) {
            textView2.setText(textView2.getText().toString() + string);
        }
    }



    public void onClick(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);//ввод
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        Hex = (Switch) findViewById(R.id.Hex);
        Oct = (Switch) findViewById(R.id.Oct);
        Dec = (Switch) findViewById(R.id.Dec);
        int c = arrayList.size();
        if (Dec.isChecked() && Oct.isChecked() && Hex.isChecked()) {
            Toast.makeText(this, "Выбирите только одну позицию", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            Oct.setChecked(false);
            Hex.setChecked(false);
            Dec.setChecked(false);
        } else if (Oct.isChecked() && Hex.isChecked() || Oct.isChecked() && Dec.isChecked() || Dec.isChecked() && Hex.isChecked()) {
            Toast.makeText(this, "Выбирите только одну позицию", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            Oct.setChecked(false);
            Hex.setChecked(false);
            Dec.setChecked(false);
        } else if (Oct.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                int a = Integer.parseInt(arrayList.get(0), 8);
                String octal = Integer.toBinaryString(a);
                resultField.setText(octal);
            }
        } else if (Dec.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                int a = Integer.parseInt(arrayList.get(0), 8);
                int b = octalToDecimal(a);
                resultField.setText(Integer.toString(b));
            }
        } else if (Hex.isChecked()) {
            if (arrayList.isEmpty()) {
                resultField.setText("0");
            } else {
                int a = Integer.parseInt(arrayList.get(0), 8);
                String b = Integer.toHexString(a);
                resultField.setText(b);
            }
        } else if (arrayList.isEmpty()) {
            resultField.setText("0");
        }
    }



    public static int octalToDecimal(int onum) {
        int num = 0;
        int p = 0;
        while (true) {
            if (onum == 0) {
                break;
            } else {
                int temp = onum % 10;
                num += temp * Math.pow(8, p);
                onum = onum / 10;
                p++;
            }
        }
        return num;
    }

    public void clear1(View view) {
        textView2.setText("");
    }

    public void onClear(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        string = "";
        string1 = "";
        resultField.setText("");
        numberField.setText("");
        arrayList.clear();
        Oct.setChecked(false);
        Hex.setChecked(false);
        Dec.setChecked(false);
    }
}
