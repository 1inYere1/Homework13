package com.homework13;


import com.homework13.ui.ArrayUI;

public class Main {

    public static void main(String[] args) {

        int[] array = {3, 65, 46, 56, 23, 1, 42};
        int[] array1 = {31, 5, 16, 6, 57, 11, 32};
        int[] array2 = {90, 87, 0, 55, 4, 10, 17};


        ArrayUI arrayUI = new ArrayUI();
        arrayUI.wayToOutputArrays(array, array1, array2);



    }
}
