package com.homework13.ui;

import com.homework13.ArrayPrinter.ArrayPrinter;
import com.homework13.ArrayPrinter.DefaultArrayPrinter;
import com.homework13.ArrayPrinter.PrettyArrayPrinter;

import java.util.Scanner;

public class ArrayUI {

    Scanner sc = new Scanner(System.in);
    private ArrayPrinter arrayPrinter;


    public void wayToOutputArrays(int[] arr, int[] arr2, int[] arr3){
        System.out.println("Выберите способ вывода массивов:");
        System.out.println("1 - удобный");
        System.out.println("2 - стандартный");
        int choice = sc.nextInt();
        if (choice == 1) {
            arrayPrinter = new PrettyArrayPrinter();
        } else arrayPrinter = new DefaultArrayPrinter();


        arrayPrinter.print(arr);
        System.out.println(" ");
        arrayPrinter.print(arr2);
        System.out.println(" ");
        arrayPrinter.print(arr3);
    }

}
