package com.example.g8s21navigetor;

import androidx.lifecycle.ViewModel;

public class DividirViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    double num1, num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado(){
        return num1 / num2;
    }
}