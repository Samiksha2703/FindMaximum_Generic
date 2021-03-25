package com.bridgelabz.findmaximumtest;

import com.bridgelabz.findmaximum.FindMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {

    private static final FindMaximum findMax = new FindMaximum();

    @Test
    public void whenGivenThreeNumbers_AndFirstNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 2, 1};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(3), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndSecondNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 5, 1};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(5), result);
    }

    @Test
    public void whenGivenThreeNumbers_AndThirdNumberIsMax_ShouldReturn_true() {
        Integer[] intArray = {3, 1, 8};
        Integer result = findMax.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(8), result);
    }

    @Test
    public void whenGivenThreeFloatNumbers_AndFirstFloatIsMax_ShouldReturn_true() {
        Float [] floatArray = {5.8f, 1.2f, 3.4f};
        Float result = findMax.findMaximum(floatArray);
        Assertions.assertEquals(Float.valueOf(5.8f), result);
    }

    @Test
    public void whenGivenThreeFloatNumbers_AndSecondFloatIsMax_ShouldReturn_true() {
        Float [] floatArray = {5.2f, 8.9f, 2.1f};
        Float result = findMax.findMaximum(floatArray);
        Assertions.assertEquals(Float.valueOf(8.9f), result);
    }


    @Test
    public void whenGivenThreeFloatNumbers_AndThirdFloatIsMax_ShouldReturn_true() {
        Float [] floatArray = {5.9f, 2.1f, 7.6f};
        Float result = findMax.findMaximum(floatArray);
        Assertions.assertEquals(Float.valueOf(7.6f), result);
    }

    @Test
    public void whenGivenThreeStrings_AndFirstStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Pratiksha", "Neha", "Kavya"};
        String result = findMax.findMaximum(stringArray);
        Assertions.assertEquals("Pratiksha", result);
    }

    @Test
    public void whenGivenThreeStrings_AndSecondStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Sakshi", "Samiksha", "Neha"};
        String result = findMax.findMaximum(stringArray);
        Assertions.assertEquals("Samiksha", result);
    }


    @Test
    public void whenGivenThreeStrings_AndThirdStringIsMax_ShouldReturn_true() {
        String [] stringArray = {"Neha", "Ankita", "Samiksha"};
        String result = findMax.findMaximum(stringArray);
        Assertions.assertEquals("Samiksha", result);
    }
}
