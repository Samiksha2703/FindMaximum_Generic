package com.bridgelabz.findmaximum;

public class FindMaximum {

    //Single generic method to compare different types of data
    public <T extends Comparable> T findMaximum(T[] numberArray) {
        T max = numberArray[0];
        for (T element : numberArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
