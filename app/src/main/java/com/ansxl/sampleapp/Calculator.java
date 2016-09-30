package com.ansxl.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Boolean;
import java.util.ArrayList;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    public Button[] buttons = new Button[17];
    TextView pantallita;
    private static final int[] BUTTON_IDS = {
            R.id.Bt0,
            R.id.Bt1,
            R.id.Bt2,
            R.id.Bt3,
            R.id.Bt4,
            R.id.Bt5,
            R.id.Bt6,
            R.id.Bt7,
            R.id.Bt8,
            R.id.Bt9,
            R.id.Mas,
            R.id.Menos,
            R.id.Multiplicacion,
            R.id.Division,
            R.id.Igual,
            R.id.Punto,
            R.id.Clear
    };

    float num1=0;
    float num2=0;
    float result=0;
    ArrayList<Boolean> list =  new ArrayList<Boolean>();
    Boolean resultgiven = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculateur);
        for(int i=0; i<17; i++){
            buttons[i] = (Button) findViewById(BUTTON_IDS[i]);
            buttons[i].setOnClickListener(this);
        }
        pantallita = (TextView) findViewById(R.id.pantallita);
        pantallita.setTextSize(35);

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
                    buttons[16].performClick();
                    pantallita.append("0");
                    resultgiven=false;
                }
                else{
                    pantallita.append("0");
                }
            }break;
            case R.id.Bt1:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("1");
                    resultgiven=false;
                }
                else{
                    pantallita.append("1");
                }
            }break;
            case R.id.Bt2:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("2");
                    resultgiven=false;
                }
                else{
                    pantallita.append("2");
                }
            }break;
            case R.id.Bt3:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("3");
                    resultgiven=false;
                }
                else{
                    pantallita.append("3");
                }
            }break;
            case R.id.Bt4:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("4");
                    resultgiven=false;
                }
                else{
                    pantallita.append("4");
                }
            }break;
            case R.id.Bt5:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("5");
                    resultgiven=false;
                }
                else{
                    pantallita.append("5");
                }
            }break;
            case R.id.Bt6:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("6");
                    resultgiven=false;
                }
                else{
                    pantallita.append("6");
                }
            }break;
            case R.id.Bt7:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("7");
                    resultgiven=false;
                }
                else{
                    pantallita.append("7");
                }
            }break;
            case R.id.Bt8:{
                if(resultgiven){
                    buttons[16].performClick();
                    pantallita.append("8");
                    resultgiven=false;
                }
                else{
                    pantallita.append("8");
                }
            }break;
            case R.id.Bt9:{
                if(resultgiven){
                    buttons[16].performClick();
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
                        buttons[16].performClick();
                        resultgiven = false;
                    }
                    else {
                        num2 = Float.parseFloat(pantallita.getText().toString());
                        if((num2==0.0f) || (num1==0.0f)){ // can't compare null to a float because of float being a primitive type and null check is only used for object
                            buttons[16].performClick();
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
