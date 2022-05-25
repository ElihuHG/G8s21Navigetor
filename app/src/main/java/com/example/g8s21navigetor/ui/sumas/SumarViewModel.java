package com.example.g8s21navigetor.ui.sumas;

import androidx.lifecycle.ViewModel;

public class SumarViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    int num1, num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado(){
        return num1 + num2;
    }
}