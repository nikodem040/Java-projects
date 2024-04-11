package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("no roots");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            if (isInteger(root)) {
                System.out.println((int) root); // Print integer part
            } else {
                System.out.println(root); // Print as it is
            }
        } else {
            double root1 = (-b - Math.sqrt(delta)) / (2 * a);
            double root2 = (-b + Math.sqrt(delta)) / (2 * a);
            if (isInteger(root1)) {
                System.out.print((int) root1 + " "); // Print integer part
            } else {
                System.out.print(root1 + " "); // Print as it is
            }
            if (isInteger(root2)) {
                System.out.println((int) root2); // Print integer part
            } else {
                System.out.println(root2); // Print as it is
            }
        }
    }

    // Helper method to check if a double is an integer
    private static boolean isInteger(double num) {
        return Math.floor(num) == num;
    }
}
