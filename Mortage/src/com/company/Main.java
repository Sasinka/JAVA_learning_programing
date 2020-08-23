package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Principal: ");
        Scanner principal = new Scanner(System.in);
        double principalValue = principal.nextInt();
        System.out.print("Annual input rate: ");
        Scanner annualInputRate = new Scanner(System.in);
        double rate = annualInputRate.nextDouble()/1200;
        System.out.print("Period (year): ");
        Scanner period = new Scanner(System.in);
        double time = period.nextInt()*12;
        double mortage;
        double numerator;
        numerator = rate* Math.pow((1+rate), time);
        double denominator = Math.pow((1+rate), time) -1;

        mortage = (double)principalValue*numerator/denominator;
        System.out.print("Yours mortage is: "+ mortage);




    }
}
