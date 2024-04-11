package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] spiral = new int[rows][columns];
        // Logic to generate the spiral matrix goes here
        int value = 1, top = 0, bottom = rows - 1, left = 0, right = columns - 1;
        while (top <= bottom && left <= right) {
            // Fill the top row from left to right
            for (int i = left; i <= right; i++) {
                spiral[top][i] = value++;
            }
            top++;

            // Fill the rightmost column from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = value++;
            }
            right--;

            // Fill the bottom row from right to left
            if (top <= bottom) { // Check if top is still less than or equal to bottom
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = value++;
                }
                bottom--;
            }

            // Fill the leftmost column from bottom to top
            if (left <= right) { // Check if left is still less than or equal to right
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = value++;
                }
                left++;
            }
        }

        return spiral;
    }

    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(3, 4);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}
