package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // Read the feet that snail travels up each day
        int b = scanner.nextInt(); // Read the feet that slides down each night
        int h = scanner.nextInt(); // Read the height of the tree



        if(a >= h)
        {
            System.out.println(1);
        }
        else if(a < b)
        {
            System.out.println("Impossible");
        }

        else if(a > b)
        {
            int days = (h - b - 1) / (a - b) + 1; // Corrected calculation
            System.out.println(days);
        }
        else
        {
            System.out.println("Impossible");
        }
    }

}
