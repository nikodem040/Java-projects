package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {
        // Create a boolean array to mark local maxima elements
        boolean[] isLocalMaxima = new boolean[array.length];

        // Identify local maxima elements
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                isLocalMaxima[i] = true;
            }
        }

        // Handle the first element
        if (array.length > 1 && array[0] > array[1]) {
            isLocalMaxima[0] = true;
        }

        // Handle the last element
        if (array.length > 1 && array[array.length - 1] > array[array.length - 2]) {
            isLocalMaxima[array.length - 1] = true;
        }

        // Count the number of non-local maxima elements
        int count = 0;
        for (boolean maxima : isLocalMaxima) {
            if (!maxima) {
                count++;
            }
        }

        // Create a new array to hold the result with the appropriate size
        int[] resultArray = new int[count];
        int index = 0;

        // Copy the non-local maxima elements to the result array
        for (int i = 0; i < array.length; i++) {
            if (!isLocalMaxima[i]) {
                resultArray[index++] = array[i];
            }
        }

        return resultArray;
    }
}
