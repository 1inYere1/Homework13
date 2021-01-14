package com.homework13.ArrayPrinter;

public class PrettyArrayPrinter extends ArrayPrinter {

    @Override
    protected void printElem(int elem) {
        System.out.print(elem + ", ");
    }
}
