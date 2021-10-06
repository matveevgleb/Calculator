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

public class Engineering extends AppCompatActivity {
    private long calc = 0;
    private double d = 0.0;
    private double a = 0.0;
    private float g = 0;
    Button DEG, RAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        setTitle("Engineering calculator ");
        Window window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick2(View v) {
        Intent intent = new Intent(Engineering.this, com.example.calc.MainActivity.class);
        startActivity(intent);
        finish();
    }



    public void onClick4(View view) {
        Intent intent = new Intent(Engineering.this, com.example.calc.Programmer.class);
        startActivity(intent);
        finish();
    }

    static int Factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public void on2ndFal(View v) {
        Button nd = (Button) findViewById(R.id.nd);
        Button ndfalse = (Button) findViewById(R.id.ndfalse);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button sin1 = (Button) findViewById(R.id.sin1);
        Button cos1 = (Button) findViewById(R.id.cos1);
        Button tan1 = (Button) findViewById(R.id.tan1);
        Button sinh = (Button) findViewById(R.id.sinh);
        Button cosh = (Button) findViewById(R.id.cosh);
        Button tanh = (Button) findViewById(R.id.tanh);
        Button hyp = (Button) findViewById(R.id.hyp);
        nd.setEnabled(true);
        hyp.setEnabled(true);
        ndfalse.setVisibility(View.GONE);
        sinh.setVisibility(View.GONE);
        cosh.setVisibility(View.GONE);
        tanh.setVisibility(View.GONE);
        sin.setVisibility(View.VISIBLE);
        cos.setVisibility(View.VISIBLE);
        tan.setVisibility(View.VISIBLE);
        sin1.setVisibility(View.GONE);
        cos1.setVisibility(View.GONE);
        tan1.setVisibility(View.GONE);
        nd.setVisibility(View.VISIBLE);
    }

    public void on2nd(View v) {
        Button ndfalse = (Button) findViewById(R.id.ndfalse);
        Button nd = (Button) findViewById(R.id.nd);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button sin1 = (Button) findViewById(R.id.sin1);
        Button cos1 = (Button) findViewById(R.id.cos1);
        Button tan1 = (Button) findViewById(R.id.tan1);
        Button sinh = (Button) findViewById(R.id.sinh);
        Button cosh = (Button) findViewById(R.id.cosh);
        Button tanh = (Button) findViewById(R.id.tanh);
        Button hyp = (Button) findViewById(R.id.hyp);
        hyp.setEnabled(true);
        ndfalse.setEnabled(false);
        nd.setVisibility(View.GONE);
        ndfalse.setVisibility(View.VISIBLE);
        sinh.setVisibility(View.GONE);
        cosh.setVisibility(View.GONE);
        tanh.setVisibility(View.GONE);
        sin.setVisibility(View.GONE);
        cos.setVisibility(View.GONE);
        tan.setVisibility(View.GONE);
        sin1.setVisibility(View.VISIBLE);
        cos1.setVisibility(View.VISIBLE);
        tan1.setVisibility(View.VISIBLE);
    }

    public void onHypFal(View v) {
        Button hyp = (Button) findViewById(R.id.hyp);
        Button hypfalse = (Button) findViewById(R.id.hypfalse);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button sinh = (Button) findViewById(R.id.sinh);
        Button cosh = (Button) findViewById(R.id.cosh);
        Button tanh = (Button) findViewById(R.id.tanh);
        Button sin1 = (Button) findViewById(R.id.sin1);
        Button cos1 = (Button) findViewById(R.id.cos1);
        Button tan1 = (Button) findViewById(R.id.tan1);
        Button ndfalse = (Button) findViewById(R.id.ndfalse);
        Button nd = (Button) findViewById(R.id.nd);
        hypfalse.setEnabled(false);
        nd.setEnabled(true);
        sin.setVisibility(View.VISIBLE);
        cos.setVisibility(View.VISIBLE);
        tan.setVisibility(View.VISIBLE);
        hyp.setVisibility(View.VISIBLE);
        hypfalse.setVisibility(View.GONE);
        sinh.setVisibility(View.GONE);
        cosh.setVisibility(View.GONE);
        tanh.setVisibility(View.GONE);
        sin1.setVisibility(View.GONE);
        cos1.setVisibility(View.GONE);
        tan1.setVisibility(View.GONE);
    }

    public void onHyp(View v) {
        Button hyp = (Button) findViewById(R.id.hyp);
        Button hypfalse = (Button) findViewById(R.id.hypfalse);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button sinh = (Button) findViewById(R.id.sinh);
        Button cosh = (Button) findViewById(R.id.cosh);
        Button tanh = (Button) findViewById(R.id.tanh);
        Button sin1 = (Button) findViewById(R.id.sin1);
        Button cos1 = (Button) findViewById(R.id.cos1);
        Button tan1 = (Button) findViewById(R.id.tan1);
        Button ndfalse = (Button) findViewById(R.id.ndfalse);
        Button nd = (Button) findViewById(R.id.nd);
        hypfalse.setEnabled(true);
        ndfalse.setEnabled(true);
        nd.setEnabled(true);
        sin1.setVisibility(View.GONE);
        cos1.setVisibility(View.GONE);
        tan1.setVisibility(View.GONE);
        sin.setVisibility(View.GONE);
        cos.setVisibility(View.GONE);
        tan.setVisibility(View.GONE);
        hyp.setVisibility(View.GONE);
        hypfalse.setVisibility(View.VISIBLE);
        sinh.setVisibility(View.VISIBLE);
        cosh.setVisibility(View.VISIBLE);
        tanh.setVisibility(View.VISIBLE);
    }

    public void BegInvis(View v) {
        Button hypfalse = (Button) findViewById(R.id.hypfalse);
        Button sinh = (Button) findViewById(R.id.sinh);
        Button cosh = (Button) findViewById(R.id.cosh);
        Button tanh = (Button) findViewById(R.id.tanh);
        Button nd = (Button) findViewById(R.id.nd);
        Button ndfalse = (Button) findViewById(R.id.ndfalse);
        Button hyp = (Button) findViewById(R.id.hyp);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button xy = (Button) findViewById(R.id.xy);
        Button ig = (Button) findViewById(R.id.ig);
        Button in = (Button) findViewById(R.id.in);
        Button ctg = (Button) findViewById(R.id.ctg);
        Button cosec = (Button) findViewById(R.id.cosec);
        Button x = (Button) findViewById(R.id.x);
        Button y = (Button) findViewById(R.id.y);
        Button gcp = (Button) findViewById(R.id.gcp);
        Button vis = (Button) findViewById(R.id.vis);
        Button invis = (Button) findViewById(R.id.invis);
        Button sin1 = (Button) findViewById(R.id.sin1);
        Button cos1 = (Button) findViewById(R.id.cos1);
        Button tan1 = (Button) findViewById(R.id.tan1);
        Button help = (Button) findViewById(R.id.Help);
        help.setVisibility(View.INVISIBLE);
        gcp.setVisibility(View.GONE);
        sin1.setVisibility(View.GONE);
        cos1.setVisibility(View.GONE);
        tan1.setVisibility(View.GONE);
        nd.setVisibility(View.GONE);
        ndfalse.setVisibility(View.GONE);
        vis.setVisibility(View.VISIBLE);
        hyp.setVisibility(View.GONE);
        sin.setVisibility(View.GONE);
        cos.setVisibility(View.GONE);
        tan.setVisibility(View.GONE);
        xy.setVisibility(View.GONE);
        ig.setVisibility(View.GONE);
        in.setVisibility(View.GONE);
        ctg.setVisibility(View.GONE);
        x.setVisibility(View.GONE);
        y.setVisibility(View.GONE);
        invis.setVisibility(View.GONE);
        tanh.setVisibility(View.GONE);
        cosh.setVisibility(View.GONE);
        sinh.setVisibility(View.GONE);
        hypfalse.setVisibility(View.GONE);
        cosec.setVisibility(View.GONE);
    }

    public void BegVis(View v) {
        Button hypfalse = (Button) findViewById(R.id.hypfalse);
        Button sinh = (Button) findViewById(R.id.sinh);
        Button cosh = (Button) findViewById(R.id.cosh);
        Button tanh = (Button) findViewById(R.id.tanh);
        Button nd = (Button) findViewById(R.id.nd);
        Button ndfalse = (Button) findViewById(R.id.ndfalse);
        Button hyp = (Button) findViewById(R.id.hyp);
        Button sin = (Button) findViewById(R.id.sin);
        Button cos = (Button) findViewById(R.id.cos);
        Button tan = (Button) findViewById(R.id.tan);
        Button xy = (Button) findViewById(R.id.xy);
        Button ig = (Button) findViewById(R.id.ig);
        Button in = (Button) findViewById(R.id.in);
        Button ctg = (Button) findViewById(R.id.ctg);
        Button cosec = (Button) findViewById(R.id.cosec);
        Button x = (Button) findViewById(R.id.x);
        Button y = (Button) findViewById(R.id.y);
        Button gcp = (Button) findViewById(R.id.gcp);
        Button vis = (Button) findViewById(R.id.vis);
        Button invis = (Button) findViewById(R.id.invis);
        Button sin1 = (Button) findViewById(R.id.sin1);
        Button cos1 = (Button) findViewById(R.id.cos1);
        Button tan1 = (Button) findViewById(R.id.tan1);
        Button help = (Button) findViewById(R.id.Help);
        Button Help2 = (Button) findViewById(R.id.button2);
        Help2.setVisibility(View.INVISIBLE);
        help.setVisibility(View.GONE);
        sin1.setVisibility(View.GONE);
        cos1.setVisibility(View.GONE);
        tan1.setVisibility(View.GONE);
        nd.setVisibility(View.VISIBLE);
        vis.setVisibility(View.GONE);
        hyp.setVisibility(View.VISIBLE);
        sin.setVisibility(View.VISIBLE);
        cos.setVisibility(View.VISIBLE);
        cosec.setVisibility(View.VISIBLE);
        tan.setVisibility(View.VISIBLE);
        xy.setVisibility(View.VISIBLE);
        ig.setVisibility(View.VISIBLE);
        in.setVisibility(View.VISIBLE);
        ctg.setVisibility(View.VISIBLE);
        x.setVisibility(View.VISIBLE);
        y.setVisibility(View.VISIBLE);
        gcp.setVisibility(View.VISIBLE);
        invis.setVisibility(View.VISIBLE);
        tanh.setVisibility(View.GONE);
        cosh.setVisibility(View.GONE);
        sinh.setVisibility(View.GONE);
        hypfalse.setVisibility(View.GONE);
        ndfalse.setVisibility(View.GONE);
    }

    public void onClick1(View view) {
        final TextView numberField = (TextView) findViewById(R.id.numberField);
        final TextView resultField = (TextView) findViewById(R.id.resultField);
        Button button = (Button) view;
        string = (String) button.getText().toString();
        if (string.contains("0") || string.contains("1") || string.contains("2") || string.contains("3") || string.contains("4") || string.contains("5") ||
                string.contains("6") || string.contains("7") || string.contains("8") || string.contains("9")) {
            string1 = string1 + string;
            if (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            numberField.setText(numberField.getText().toString() + string);
            arrayList.add(string1);
        } else {
            arrayList.add(string);
            arrayList.add(string);
            string1 = "";
            if (numberField.length() == 0 && (string.contains("-") || string.contains("+") || string.contains("×") || string.contains("÷") || string.contains("%")
                    || string.contains("x!") || string.contains("tan") || string.contains("cos") || string.contains("sin") || string.contains("Ig") ||
                    string.contains("In") || string.contains("tanh") || string.contains("cosh") || string.contains("sinh") || string.contains("asin") ||
                    string.contains("acos") || string.contains("atan") || string.contains("^") || string.contains("√") || string.contains("ctg")
                    || string.contains("exp")||string.contains("mod") )){
                Toast.makeText(this, "Enter a natural number", Toast.LENGTH_SHORT).show();
                resultField.setText("");
                numberField.setText("");
                arrayList.clear();
            } else {
                if (string.contains("√") || string.contains("cos") || string.contains("tan") || string.contains("sin") || string.contains("Ig") || string.contains("In") ||
                        string.contains("cosh") || string.contains("tanh") || string.contains("sinh") || string.contains("acos") || string.contains("atan") ||
                        string.contains("asin") || string.contains("ctg")||string.contains("exp")) {
                    numberField.setText(string + "(" + numberField.getText().toString());
                } else if (string.contains("!")) {
                    numberField.setText(numberField.getText().toString() + "!");
                }  else {
                    numberField.setText(numberField.getText().toString() + string);
                }
            }
        }
        if (resultField.getText() != "") {
            String a = resultField.getText().toString();
            numberField.setText(a);
            resultField.setText("");
        }
        if (string.contains("cos") || string.contains("tan") || string.contains("sin") || string.contains("cosh") || string.contains("tanh") || string.contains("sinh")
                || string.contains("acos") || string.contains("atan") || string.contains("asin")) {
            DEG = (Button) findViewById(R.id.DEG);
            DEG.setVisibility(View.VISIBLE);
        }
    }

    public void Output(View view) {
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
        }else {
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
                        if (arrayList.get(1).contains("!")) {
                            int cal = Integer.parseInt(arrayList.get(0));
                            calc = Factorial(cal);
                        }
                        if (arrayList.get(1).contains("÷")) {
                            d = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(arrayList.get(2));
                            calc = Long.parseLong(arrayList.get(0)) / Long.parseLong((arrayList.get(2)));
                        }
                        if (arrayList.get(1).contains("+")) {
                            calc = Integer.parseInt(arrayList.get(0)) + Long.parseLong((arrayList.get(2)));
                        }
                        if (arrayList.get(1).contains("×")) {
                            calc = Long.parseLong(arrayList.get(0)) * Long.parseLong(arrayList.get(2));
                        }
                        if (arrayList.get(1).contains("-")) {
                            calc = Long.parseLong(arrayList.get(0)) - Long.parseLong(arrayList.get(2));
                        }
                        if(arrayList.get(1).contains("mod")){
                            calc=Long.parseLong(arrayList.get(0))%Long.parseLong(arrayList.get(2));
                        }
                        arrayList.remove(0);
                        arrayList.remove(0);
                        arrayList.remove(0);
                        arrayList.add(0, Long.toString(calc));
                        c = arrayList.size();
                        g = (float) d;
                        if (g % 2 == 0 || g % 1 == 0) {
                            resultField.setText(Long.toString(calc));
                        } else {
                            resultField.setText(Float.toString(g));
                        }
                    }
                } else if (arrayList.contains("sin") || arrayList.contains("cos") || arrayList.contains("tan") || arrayList.contains("In") || arrayList.contains("Ig") ||
                        arrayList.contains("sinh") || arrayList.contains("cosh") || arrayList.contains("tanh") || arrayList.contains("√") || arrayList.contains("^") ||
                        arrayList.contains("asin") || arrayList.contains("acos") || arrayList.contains("atan") || arrayList.contains("ctg")||arrayList.contains("exp")) {
                    if (arrayList.get(1).contains("^")) {
                        int calc1 = Integer.parseInt(arrayList.get(0));
                        int calc2 = Integer.parseInt(arrayList.get(2));
                        d = Math.pow(calc1, calc2);
                    }

                    if(arrayList.get(1).contains("exp")){
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d=Math.exp(degrees);
                    }
                    if (arrayList.get(1).contains("ctg")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = 1 / Math.tan(degrees);
                    }
                    if (arrayList.get(1).contains("In")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = Math.log(degrees);
                    }
                    if (arrayList.contains("Ig")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = Math.log10(degrees);
                    }
                    if (arrayList.get(1).contains("cos")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        a = Math.toRadians(degrees);
                        d = Math.cos(a);
                    }
                    if (arrayList.get(1).contains("tan")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        a = Math.toRadians(degrees);
                        d = Math.tan(a);
                    }
                    if (arrayList.get(1).contains("sin")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        a = Math.toRadians(degrees);
                        d = Math.sin(a);
                    }
                    if (arrayList.get(1).contains("cosh")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = Math.cosh(degrees);
                    }
                    if (arrayList.get(1).contains("tanh")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = Math.tanh(degrees);
                    }
                    if (arrayList.get(1).contains("sinh")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = Math.sinh(degrees);
                    }
                    if (arrayList.get(1).contains("√")) {
                        double degrees = Double.parseDouble(arrayList.get(0));
                        d = Math.sqrt(degrees);
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Double.toString(d));
                    c = arrayList.size();
                    calc = (long) d;
                    if (d % 2 == 0 || d % 1 == 0) {
                        resultField.setText(Long.toString(calc));
                    } else {
                        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
                        String a = decimalFormat.format(d);
                        resultField.setText(a);
                    }
                } else if (arrayList.contains("%") || arrayList.contains("1/")) {
                    if (arrayList.get(1).contains("%")) {
                        g = Float.parseFloat(arrayList.get(0)) / 100;
                        calc = Long.parseLong(arrayList.get(0)) / 100;
                    }
                    if (arrayList.get(1).contains("1/")) {
                        calc = 1 / Long.parseLong(arrayList.get(0));
                        g = 1 / Float.parseFloat(arrayList.get(0));
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Long.toString(calc));
                    c = arrayList.size();
                    if (g % 2 == 0 || g % 1 == 0) {
                        resultField.setText(Long.toString(calc));
                    } else {
                        resultField.setText(Float.toString(g));
                    }
                } else {
                    if (arrayList.get(1).contains("!")) {
                        int cal = Integer.parseInt(arrayList.get(0));
                        calc = Factorial(cal);
                    }
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
                    if (arrayList.get(1).contains("1/")) {
                        calc = 1 / Long.parseLong(arrayList.get(0));
                        d = 1 / Float.parseFloat(arrayList.get(0));
                    }
                    if(arrayList.get(1).contains("mod")){
                        calc=Long.parseLong(arrayList.get(0))%Long.parseLong(arrayList.get(2));
                    }
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Long.toString(calc));
                    c = arrayList.size();
                    g = (float) d;
                    if (g % 2 == 0 || g % 1 == 0) {
                        resultField.setText(Long.toString(calc));
                    } else {
                        resultField.setText(Float.toString(g));
                    }
                }
            }
        }
    }

    public void onDeg(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        RAD = (Button) findViewById(R.id.RAD);
        RAD.setVisibility(View.VISIBLE);
        DEG.setVisibility(View.GONE);
        double h = 0;
        calc = (int) d;
        double g = Math.toDegrees(a);
        if (arrayList.contains("sin")) {
            h = Math.sin(g);
        }
        if (arrayList.contains("cos")) {
            h = Math.cos(g);
        }
        if (arrayList.contains("tan")) {
            h = Math.tan(g);
        }
        if (arrayList.contains("asin")) {
            h = Math.asin(g);
        }
        if (arrayList.contains("acos")) {
            h = Math.acos(g);
        }
        if (arrayList.contains("atan")) {
            h = Math.atan(g);
        }
        if (arrayList.contains("sinh")) {
            h = Math.sinh(g);
        }
        if (arrayList.contains("cosh")) {
            h = Math.cosh(g);
        }
        if (arrayList.contains("tanh")) {
            h = Math.tanh(g);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        String a = decimalFormat.format(h);
        resultField.setText(a);
    }

    public void onRad(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        RAD = (Button) findViewById(R.id.RAD);
        DEG = (Button) findViewById(R.id.DEG);
        RAD.setVisibility(View.GONE);
        DEG.setVisibility(View.VISIBLE);
        double h = 0;
        calc = (int) d;
        if (arrayList.contains("sin")) {
            h = Math.sin(a);
        }
        if (arrayList.contains("cos")) {
            h = Math.cos(a);
        }
        if (arrayList.contains("tan")) {
            h = Math.tan(a);
        }
        if (arrayList.contains("asin")) {
            h = Math.asin(a);
        }
        if (arrayList.contains("acos")) {
            h = Math.acos(a);
        }
        if (arrayList.contains("atan")) {
            h = Math.atan(a);
        }
        if (arrayList.contains("sinh")) {
            h = Math.sinh(a);
        }
        if (arrayList.contains("cosh")) {
            h = Math.cosh(a);
        }
        if (arrayList.contains("tanh")) {
            h = Math.tanh(a);
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        String a = decimalFormat.format(h);
        resultField.setText(a);
    }

    public void clear(View view) {
        TextView resultField = (TextView) findViewById(R.id.resultField);
        TextView numberField = (TextView) findViewById(R.id.numberField);
        Button Deg = (Button) findViewById(R.id.DEG);
        RAD = (Button) findViewById(R.id.RAD);
        RAD.setVisibility(View.GONE);
        Deg.setVisibility(View.GONE);
        string = "";
        string1 = "";
        resultField.setText("");
        numberField.setText("");
        arrayList.clear();
    }
}