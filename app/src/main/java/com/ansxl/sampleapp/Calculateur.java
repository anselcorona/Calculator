package com.ansxl.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Boolean;
import java.util.ArrayList;

public class Calculateur extends AppCompatActivity implements View.OnClickListener {

    public Button Bt1;
    public Button Bt2;
    public Button Bt3;
    public Button Bt4;
    public Button Bt5;
    public Button Bt6;
    public Button Bt7;
    public Button Bt8;
    public Button Bt9;
    public Button Bt0;
    public Button Mas;
    public Button Menos;
    public Button Star;
    public Button Slash;
    public Button Igual;
    public Button Punto;
    public Button Clear;

    TextView pantallita;

    float num1=0;
    float num2=0;
    float result=0;
    ArrayList<Boolean> list =  new ArrayList<Boolean>();
    Boolean resultgiven = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculateur);

        Bt9 = (Button)  findViewById(R.id.Bt9);
        Bt8 = (Button)  findViewById(R.id.Bt8);
        Bt7 = (Button)  findViewById(R.id.Bt7);
        Bt6 = (Button)  findViewById(R.id.Bt6);
        Bt5 = (Button)  findViewById(R.id.Bt5);
        Bt4 = (Button)  findViewById(R.id.Bt4);
        Bt3 = (Button)  findViewById(R.id.Bt3);
        Bt2 = (Button)  findViewById(R.id.Bt2);
        Bt1 = (Button)  findViewById(R.id.Bt1);
        Bt0 = (Button)  findViewById(R.id.Bt0);
        Mas = (Button)  findViewById(R.id.Mas);
        Menos=(Button)  findViewById(R.id.Menos);
        Star= (Button)  findViewById(R.id.Multiplicacion);
        Slash=(Button)  findViewById(R.id.Division);
        Igual=(Button)  findViewById(R.id.Igual);
        Punto=(Button)  findViewById(R.id.Punto);
        Clear=(Button)  findViewById(R.id.Clear);

        pantallita = (TextView) findViewById(R.id.pantallita);
        pantallita.setTextSize(35);

        Bt0.setOnClickListener(this);
        Bt1.setOnClickListener(this);
        Bt2.setOnClickListener(this);
        Bt3.setOnClickListener(this);
        Bt4.setOnClickListener(this);
        Bt5.setOnClickListener(this);
        Bt6.setOnClickListener(this);
        Bt7.setOnClickListener(this);
        Bt8.setOnClickListener(this);
        Bt9.setOnClickListener(this);
        Mas.setOnClickListener(this);
        Menos.setOnClickListener(this);
        Star.setOnClickListener(this);
        Slash.setOnClickListener(this);
        Igual.setOnClickListener(this);
        Punto.setOnClickListener(this);
        Clear.setOnClickListener(this);

        for (int i=0;i<4;i++){
            list.add(i,false);
        }

    }

    public void onClick(View v){



        switch (v.getId()){
            //clear
            case R.id.Clear:{
                num1 = 0;
                num2 = 0;
                pantallita.setText(null);
                for(Boolean b : list){
                    b=false;
                }
            }break;


            //Botones numeros y punto
            case R.id.Bt0:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("0");
                    resultgiven=false;
                }
                else{
                    pantallita.append("0");
                }
            }break;
            case R.id.Bt1:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("1");
                    resultgiven=false;
                }
                else{
                    pantallita.append("1");
                }
            }break;
            case R.id.Bt2:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("2");
                    resultgiven=false;
                }
                else{
                    pantallita.append("2");
                }
            }break;
            case R.id.Bt3:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("3");
                    resultgiven=false;
                }
                else{
                    pantallita.append("3");
                }
            }break;
            case R.id.Bt4:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("4");
                    resultgiven=false;
                }
                else{
                    pantallita.append("4");
                }
            }break;
            case R.id.Bt5:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("5");
                    resultgiven=false;
                }
                else{
                    pantallita.append("5");
                }
            }break;
            case R.id.Bt6:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("6");
                    resultgiven=false;
                }
                else{
                    pantallita.append("6");
                }
            }break;
            case R.id.Bt7:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("7");
                    resultgiven=false;
                }
                else{
                    pantallita.append("7");
                }
            }break;
            case R.id.Bt8:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("8");
                    resultgiven=false;
                }
                else{
                    pantallita.append("8");
                }
            }break;
            case R.id.Bt9:{
                if(resultgiven){
                    Clear.performClick();
                    pantallita.append("9");
                    resultgiven=false;
                }
                else{
                    pantallita.append("9");
                }
            }break;
            case R.id.Punto:{
                if(resultgiven || pantallita.getText().toString().contains(".")){
                    nothing();
                }
                else {
                    pantallita.append(".");
                }
            }break;

            //Operaciones:
            case R.id.Mas:{
                if(resultgiven){
                    nothing();
                }
                else{
                    num1 = Float.parseFloat(pantallita.getText().toString());
                    pantallita.setText("");
                    list.set(0, true);
                }
            }break;
            case R.id.Menos:{
                if(resultgiven){
                    nothing();
                }
                else{
                    num1 = Float.parseFloat(pantallita.getText().toString());
                    pantallita.setText("");
                    list.set(1,true);
                }
            }break;
            case R.id.Multiplicacion:{
                if(resultgiven){
                    nothing();
                }
                else {
                    num1 = Float.parseFloat(pantallita.getText().toString());
                    pantallita.setText("");
                    list.set(2, true);
                }
            }break;
            case R.id.Division:{
                if(resultgiven){
                    nothing();
                }
                else {
                    num1 = Float.parseFloat(pantallita.getText().toString());
                    pantallita.setText("");
                    list.set(3, true);
                }
            }break;
            case R.id.Igual:{
                if(pantallita.getText().toString().isEmpty()){
                    nothing();
                }
                else{
                    if(resultgiven){
                        Clear.performClick();
                        resultgiven = false;
                    }
                    else {
                        num2 = Float.parseFloat(pantallita.getText().toString());
                        if((num2==0.0f) || (num1==0.0f)){ // can't compare null to a float because of float being a primitive type and null check is only used for object
                            Clear.performClick();
                        }
                        else {
                            if (list.get(0)) {
                                result = num1 + num2;
                            }
                            if (list.get(1)) {
                                result = num1 - num2;
                            }
                            if (list.get(2)) {
                                result = num1 * num2;
                            }
                            if (list.get(3)) {
                                result = num1 / num2;
                            }
                            pantallita.setText(String.valueOf(result));
                        }
                        for (int i = 0; i < 4; i++) {
                            list.set(i, false);
                        }
                        resultgiven = true;
                    }
                }
            }break;

        }
    }

    private void nothing() {
    }


}
