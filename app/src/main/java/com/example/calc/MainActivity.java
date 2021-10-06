package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private long calc = 0;
    private float d = 0;
    Button le, pr;
    public void onClick2(View v) {
        Intent intent = new Intent(MainActivity.this, com.example.calc.Engineering.class);
        startActivity(intent);
        finish();
    }


    public void onClick4(View view) {
        Intent intent = new Intent(MainActivity.this, com.example.calc.Programmer.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Standard calculator");
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick1(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        Button button = (Button) view;
        string = (String) button.getText().toString();
        if (!string.contains("+") && !string.contains("-") && !string.contains("×") && !string.contains("÷")
                && !string.contains("(") && !string.contains(")") && !string.contains("%")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            arrayList.add(string1);
        } else {
            arrayList.add(string);
            arrayList.add(string);
            string1 = "";
        }
        if (numberField.getText() != "") {
            String a = numberField.getText().toString();
            numberField.setText(a);
            resultField.setText("");
        }
        if (numberField.length() > 15 && !arrayList.contains("-") && !arrayList.contains("+") &&
                !arrayList.contains("%") && !arrayList.contains("×") && !arrayList.contains("÷")) {
            Toast.makeText(this, "Up to 15 digits can be entered", Toast.LENGTH_SHORT).show();
        } else if (numberField.length() == 0 && (string.contains("-") || string.contains("+") ||
                string.contains("×") || string.contains("÷") || string.contains("%") || string.contains("(")
                || string.contains(")"))) {
            Toast.makeText(this, "Введите натуральное число", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            arrayList.clear();
        } else {
            numberField.setText(numberField.getText().toString() + string);
        }
    }

    public void onClick(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);//ввод
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        int c = arrayList.size();
        if (c == 1) {
            resultField.setText(numberField.getText().toString());
        } else if (arrayList.get(2).contains("+") || arrayList.get(2).contains("-") || arrayList.get(2).contains("×")
                || arrayList.get(2).contains("÷")) {
            Toast.makeText(this, "Формула неверна", Toast.LENGTH_SHORT).show();
        } else if (arrayList.get(1).contains("÷") && Long.parseLong(arrayList.get(2)) == 0) {
            Toast.makeText(this, "Нельзя делить на ноль", Toast.LENGTH_SHORT).show();
        } else if (arrayList.isEmpty()) {
            resultField.setText("0");
        } else {
            while (c != 1) {
                if (c > 3) {
                    if (arrayList.get(3).contains("×") && !arrayList.get(1).contains("(") || arrayList.get(3).contains("÷")) {
                        if (arrayList.get(3).contains("×") && !arrayList.get(1).contains("(")) {
                            calc = Long.parseLong(arrayList.get(2)) * Long.parseLong((arrayList.get(4)));
                        }
                        if (arrayList.get(3).contains("÷") && !arrayList.get(1).contains("(")) {
                            calc = Long.parseLong(arrayList.get(2)) / Long.parseLong((arrayList.get(4)));
                        }
                        arrayList.remove(2);
                        arrayList.remove(2);
                        arrayList.remove(2);
                        arrayList.add(2, Long.toString(calc));
                        c = arrayList.size();
                    } else {
                        if (arrayList.get(1).contains("÷")) {
                            d = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(arrayList.get(2));
                            calc = Long.parseLong(arrayList.get(0)) / Long.parseLong((arrayList.get(2)));
                        }
                        if (arrayList.get(1).contains("+")) {
                            calc = Long.parseLong(arrayList.get(0)) + Long.parseLong((arrayList.get(2)));
                        }
                        if (arrayList.get(1).contains("×")) {
                            calc = Long.parseLong(arrayList.get(0)) * Long.parseLong(arrayList.get(2));
                        }
                        if (arrayList.get(1).contains("-")) {
                            calc = Long.parseLong(arrayList.get(0)) - Long.parseLong(arrayList.get(2));
                        }
                        arrayList.remove(0);
                        arrayList.remove(0);
                        arrayList.remove(0);
                        arrayList.add(0, Long.toString(calc));
                        c = arrayList.size();
                        if (d % 2 == 0 || d % 1 == 0) {
                            resultField.setText(Long.toString(calc));
                        } else {
                            resultField.setText(Float.toString(d));
                        }
                    }
                } else if (arrayList.get(1).contains("%")) {
                    if (arrayList.get(1).contains("%")) {
                        d = Float.parseFloat(arrayList.get(0)) / 100;
                        calc = Long.parseLong(arrayList.get(0)) / 100;
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Long.toString(calc));
                    c = arrayList.size();
                    if (d % 2 == 0 || d % 1 == 0) {
                        resultField.setText(Long.toString(calc));
                    } else {
                        resultField.setText(Float.toString(d));
                    }
                } else {
                    if (arrayList.get(1).contains("÷")) {
                        d = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(arrayList.get(2));
                        calc = Long.parseLong(arrayList.get(0)) / Long.parseLong((arrayList.get(2)));
                    }
                    if (arrayList.get(1).contains("+")) {
                        calc = Long.parseLong(arrayList.get(0)) + Long.parseLong((arrayList.get(2)));
                    }
                    if (arrayList.get(1).contains("-")) {
                        calc = Long.parseLong(arrayList.get(0)) - Long.parseLong(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("×")) {
                        calc = Long.parseLong(arrayList.get(0)) * Long.parseLong(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("(")) {
                        calc = Long.parseLong(arrayList.get(0)) * Long.parseLong(arrayList.get(2));
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Long.toString(calc));
                    c = arrayList.size();
                    if (d % 2 == 0 || d % 1 == 0) {
                        resultField.setText(Long.toString(calc));
                    } else {
                        resultField.setText(Float.toString(d));
                    }
                }
            }
        }
    }

    public void clear(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        pr = (Button) findViewById(R.id.pr);
        string = "";
        string1 = "";
        d = 0;
        pr.setClickable(true);
        resultField.setText("");
        numberField.setText("");
        arrayList.clear();

    }

}