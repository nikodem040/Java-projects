package com.epam.rd.autotasks;
import java.util.Arrays;


class CycleSwap {

    public static void main(String[] args)
    {

        int[] array = new int[]{1, 3, 2, 7, 4};
        //CycleSwap.cycleSwap(array);
       // System.out.println(Arrays.toString(array));
 CycleSwap.cycleSwap(array, 2);
         System.out.println(Arrays.toString(array));
    }
// CycleSwap.cycleSwap(array, 2);
    // System.out.println(Arrays.toString(array));

    static void cycleSwap(int[] array) {
        if (array.length <= 1) {
            return; // No need to swap if array has 0 or 1 element
        }

        int lastElement = array[array.length - 1];

        // Shift elements to the right by one position
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Set the first element to the last element
        array[0] = lastElement;
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1) {
            return; // No need to swap if array has 0 or 1 element
        }

        shift %= array.length; // Adjust shift if it's greater than the array length

        // Handle negative shifts
        if (shift < 0) {
            shift += array.length;
        }

        // No need to swap if shift is zero
        if (shift == 0) {
            return;
        }

        // Create a temporary array to store elements shifted by shift positions
        int[] temp = new int[array.length];

        // Copy elements shifted by shift positions to the temporary array
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + shift) % array.length;
            temp[newIndex] = array[i];
        }

        // Copy elements from the temporary array back to the original array
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}
