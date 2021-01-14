package com.homework13.ArrayPrinter;


public class ArrayPrinter {


    public void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            printElem(array[i]);
        }
    }

    protected void printElem(int elem){
    }
}
