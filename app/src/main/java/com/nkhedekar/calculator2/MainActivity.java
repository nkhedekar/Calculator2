package com.nkhedekar.calculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Variable Declarations
    int acc = 0, lastOp = 0, prevRes = 0, bacc = 0;
    boolean opPressed = false;
    ArrayList<Integer> results = new ArrayList<>();

    /*
        lastOp :
            0 : No Operation
            1 : Addition
            2 : Subtraction
            3 : Multiplication
            4 : Division
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button Declarations

        final Button b0 = (Button) findViewById(R.id.b0);
        final Button b1 = (Button) findViewById(R.id.b1);
        final Button b2 = (Button) findViewById(R.id.b2);
        final Button b3 = (Button) findViewById(R.id.b3);
        final Button b4 = (Button) findViewById(R.id.b4);
        final Button b5 = (Button) findViewById(R.id.b5);
        final Button b6 = (Button) findViewById(R.id.b6);
        final Button b7 = (Button) findViewById(R.id.b7);
        final Button b8 = (Button) findViewById(R.id.b8);
        final Button b9 = (Button) findViewById(R.id.b9);
        final Button bac = (Button) findViewById(R.id.bac);
        final Button bdiv = (Button) findViewById(R.id.bdiv);
        final Button bsub = (Button) findViewById(R.id.bmin);
        final Button bmul = (Button) findViewById(R.id.bmul);
        final Button badd = (Button) findViewById(R.id.bplus);
        final Button beq = (Button) findViewById(R.id.beq);

        //TextView Declarations

        final TextView res = (TextView) findViewById(R.id.res);
        final ArrayList<TextView> ress = new ArrayList<>();
        ress.add((TextView) findViewById(R.id.res5));
        ress.add((TextView) findViewById(R.id.res4));
        ress.add((TextView) findViewById(R.id.res3));
        ress.add((TextView) findViewById(R.id.res2));
        ress.add((TextView) findViewById(R.id.res1));


        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("0");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp *= 10;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("1");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 1;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("2");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 2;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("3");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 3;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("4");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 4;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("5");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 5;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("6");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 6;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                 //   prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("7");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 7;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("8");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 8;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(opPressed){
                    opPressed = false;
                //    prevRes = Integer.parseInt(res.getText().toString());
                    res.setText("9");
                }else{
                    int temp = Integer.parseInt(res.getText().toString());
                    temp = temp*10 + 9;
                    res.setText(Integer.toString(temp));
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText("0");
                results.clear();
                for(int i = 0; i<ress.size(); i++){
                    ress.get(i).setText("");
                }
                lastOp = 0;
                opPressed = false;
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acc = Integer.parseInt(res.getText().toString());
                int tempres;
                switch (lastOp) {
                    case 1:
                        tempres = acc + prevRes;
                        break;
                    case 2:
                        tempres = prevRes - acc;
                        break;
                    case 3:
                        tempres = prevRes * acc;
                        break;
                    case 4:
                        tempres = (int) prevRes / acc;
                        break;
                    default:
                        tempres = acc;
                }
                res.setText(Integer.toString(tempres));
                prevRes = tempres;
                opPressed = true;
                lastOp = 1;
            }//update res value also
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acc = Integer.parseInt(res.getText().toString());
                int tempres;
                switch (lastOp) {
                    case 1:
                        tempres = acc + prevRes;
                        break;
                    case 2:
                        tempres = prevRes - acc;
                        break;
                    case 3:
                        tempres = prevRes * acc;
                        break;
                    case 4:
                        tempres = (int) prevRes / acc;
                        break;
                    default:
                        tempres = acc;
                }
                res.setText(Integer.toString(tempres));
                prevRes = tempres;
                opPressed = true;
                lastOp = 2;
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acc = Integer.parseInt(res.getText().toString());
                int tempres;
                switch (lastOp) {
                    case 1:
                        tempres = acc + prevRes;
                        break;
                    case 2:
                        tempres = prevRes - acc;
                        break;
                    case 3:
                        tempres = prevRes * acc;
                        break;
                    case 4:
                        tempres = (int) prevRes / acc;
                        break;
                    default:
                        tempres = acc;
                }
                res.setText(Integer.toString(tempres));
                prevRes = tempres;
                opPressed = true;
                lastOp = 3;
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acc = Integer.parseInt(res.getText().toString());
                int tempres;
                switch (lastOp) {
                    case 1:
                        tempres = acc + prevRes;
                        break;
                    case 2:
                        tempres = prevRes - acc;
                        break;
                    case 3:
                        tempres = prevRes * acc;
                        break;
                    case 4:
                        tempres = (int) prevRes / acc;
                        break;
                    default:
                        tempres = acc;
                }
                res.setText(Integer.toString(tempres));
                prevRes = tempres;
                opPressed = true;
                lastOp = 4;
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acc = Integer.parseInt(res.getText().toString());
                int tempres;
                switch (lastOp) {
                    case 1:
                        tempres = acc + prevRes;
                        break;
                    case 2:
                        tempres = prevRes - acc;
                        break;
                    case 3:
                        tempres = prevRes * acc;
                        break;
                    case 4:
                        tempres = (int) prevRes / acc;
                        break;
                    default:
                        tempres = acc;
                }
                res.setText(Integer.toString(tempres));
                prevRes = tempres;
                opPressed = true;
                lastOp = 0;
                results.add(tempres);
                if(results.size()>5){
                    results.remove(0);
                }
                for(int i = results.size()-1 ; i>=0; i--){
                    ress.get(i).setText(Integer.toString(results.get(i)));
                }
                //final result updated in res
                //arraylist updated
                //res layout update

            }
        });
    }


}
