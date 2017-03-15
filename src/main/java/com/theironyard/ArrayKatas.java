package com.theironyard;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/**
 * This exercise is another collection of katas. Follow the instructions below
 * to create the specified methods.
 */
public class ArrayKatas {



        /**
         * Write a static method named sumArray() that accepts an array of doubles
         * and returns the sum of all of the numbers. The length of the array
         * received is arbitrary and unbounded. If there are zero numbers in the
         * array then return 0.
         *
         * For this method you should use a for-each loop.
         *
         * @param numbers an array of doubles
         * @return the sum of the provided array of doubles
         */
        // todo: create sumArray() method

        public static double sumArray(double[] numbers){

            double sum = 0;
            for(double i : numbers) sum += i;
            return sum;
        }


        /**
         * Create a static method named concatenateStrings() that accepts an array
         * of Strings and concentrates them together. The array of String objects is
         * is arbitrary and unbounded. If there are zero Strings in the array then
         * return an empty string.
         *
         * For this method you should use a classic for loop (not for-each).
         *
         * @param strings an array of String
         * @return a concatenation of the provided array of strings.
         */
        // todo: create concatenateStrings() method

        public static String concatenateStrings(String[] strings) {
            String sentences = "";
            for (int i = 0; i < strings.length; i++) {
                sentences = sentences + strings[i];
                if (i < strings.length);
            }
            return sentences;
        }



    /* public static String concatenateStrings(String[] strings) {
            String total = null;
            for(String i, i < strings.length, i ++){
        return strings.length; }
        } */



        /**
         * Create a static method named reverseArray that accepts an array of
         * Objects. The method should return a new array in the reverse order. For
         * example:
         *
         * input:
         *
         * ["This", true, 1, 5.6]
         *
         * reversed:
         *
         * [5.6, 1, true, "This"]
         *
         * Because the input and result can contain any type of data, make sure your
         * arguments and return data types are an array of the Object class.
         *
         * @param objects an array of arbitrary objects
         * @return an array of objects in reverse order
         */
        // todo: create reverseArray() method


public static Object reverseArray(Object[] objects){
    Object[] total = new Object[objects.length];
    for(int i = 0; i < objects.length; i++){
        total[i] = objects[objects.length - i - 1];
    }
    //Collections.reverse(Arrays.asList(objects));
    return total;
}

}