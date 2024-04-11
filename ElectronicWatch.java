package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
       // System.out.println(seconds);
        if(seconds >= 86400)
        {
            seconds %= 86400;
        }


        int minutes = (seconds / 60 );
        int hours = (minutes / 60 );

        int remainingSecondsFinal = seconds - minutes*60;
        /*
        if(hours < 10 && minutes < 10 )
        {
            System.out.println("0" + hours +":0" + (minutes - 60*hours ) + (seconds - hours*3600 - minutes*60));
        }




        if(minutes < 10 )
        {
            System.out.println("0" + hours +":0" + (minutes - 60*hours ) + (seconds - hours*3600 - minutes*60));
        }
        System.out.println( hours +":" + (minutes - 60*hours ) + ":"  + (seconds - minutes*60));

*/

        String timeString = String.format("%s:%02d:%02d", hours, (minutes - hours*60), remainingSecondsFinal);
        System.out.println(timeString);
        // System.out.println(hours +  "\n");
        //System.out.println(minutes +  "\n");
        //System.out.println(seconds +  "\n");
    }
}



