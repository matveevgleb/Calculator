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

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Programmer extends AppCompatActivity {
    private long calc = 0;
    private float d = 0;
    private double h = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmer);
        setTitle("Programmer's calculator");
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick2(View v) {
        Intent intent = new Intent(Programmer.this, com.example.calc.Engineering.class);
        startActivity(intent);
        finish();
    }

    public void onClick3(View v) {
        Intent intent = new Intent(Programmer.this, com.example.calc.MainActivity.class);
        startActivity(intent);
        finish();
    }



    public void onHex(View view) {
        Intent intent = new Intent(Programmer.this, com.example.calc.Hex.class);
        startActivity(intent);
    }

    public void onOct(View view) {
        Intent intent = new Intent(Programmer.this, com.example.calc.Octal.class);
        startActivity(intent);
    }

    public void onDec(View view) {
        Intent intent = new Intent(Programmer.this, com.example.calc.Decimal.class);
        startActivity(intent);
    }

    public void onBin(View view) {
        Intent intent = new Intent(Programmer.this, com.example.calc.Binary.class);
        startActivity(intent);
    }

    public void onClick1(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);//ввод
        final TextView resultField = (TextView) findViewById(R.id.resultField);//результат
        Button button = (Button) view;
        string = (String) button.getText().toString();
        if (!string.contains("+") && !string.contains("-") && !string.contains("×") && !string.contains("÷") && !string.contains("%") && !string.contains(",")
                && !string.contains("√") && !string.contains("^")) {
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
        if (string.contains("√")) {
            numberField.setText(string + "(" + numberField.getText().toString());
        } else if (numberField.length() == 0 && (string.contains("-") || string.contains("+") || string.contains("×") || string.contains("÷") || string.contains("%")|| string.contains("^")
                || string.contains("√"))) {
            Toast.makeText(this, "Введите натуральное число", Toast.LENGTH_SHORT).show();
            resultField.setText("");
            numberField.setText("");
            arrayList.clear();
        } else {
            numberField.setText(numberField.getText().toString() + string);
        }
    }

    public void onClick(View view) {
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        final TextView numberField = (TextView) findViewById(R.id.numberField);
        int c = arrayList.size();
        if (c == 1) {
            resultField.setText(numberField.getText().toString());
        } else if (arrayList.get(2).contains("+") || arrayList.get(2).contains("-") || arrayList.get(2).contains("×")
                || arrayList.get(2).contains("÷")) {
            Toast.makeText(this, "Формула неверна", Toast.LENGTH_SHORT).show();
        }else if(arrayList.get(1).contains("÷")&&Long.parseLong(arrayList.get(2))==0) {
            Toast.makeText(this, "Нельзя делить на ноль", Toast.LENGTH_SHORT).show();
        }else if (arrayList.isEmpty()) {
            resultField.setText("0");
        } else {
            while (c != 1) {
                if (c > 3) {
                    if (arrayList.get(3).contains("×") || arrayList.get(3).contains("÷")) {
                        if (arrayList.get(3).contains("×")) {
                            calc = Long.parseLong(arrayList.get(2)) * Long.parseLong((arrayList.get(4)));
                        }
                        if (arrayList.get(3).contains("÷")) {
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
                } else if (arrayList.contains("%")) {
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
                } else if (arrayList.contains("√")||arrayList.contains("^")) {
                    if (arrayList.get(1).contains("√")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        h = Math.sqrt(degrees);
                    }
                    if (arrayList.get(1).contains("^")) {
                        int calc1 = Integer.parseInt(arrayList.get(0));
                        int calc2 = Integer.parseInt(arrayList.get(2));
                        h = Math.pow(calc1, calc2);
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Double.toString(h));
                    c = arrayList.size();
                    calc = (long) h;
                    if (h % 2 == 0 || h % 1 == 0) {
                        resultField.setText(Long.toString(calc));
                    } else {
                        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
                        String a = decimalFormat.format(h);
                        resultField.setText(a);
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

                    if (arrayList.get(1).contains("√"))
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
        string = "";
        string1 = "";
        resultField.setText("");
        numberField.setText("");
        arrayList.clear();
    }
}