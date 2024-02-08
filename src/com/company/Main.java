package com.company;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int principal= 0;
        float annualIncome= 0;
        byte period= 0;
        float interest= 0;


        while (true) {
        System.out.print("Principal: ");
         principal = scanner.nextInt();
        if (principal >= 1000 && principal <= 1000000)
            break;
            System.out.println("Enter a value 1000 and 1000000");
        System.out.print(principal);
        }
        while (true) {
        System.out.print("Annual Income: ");
         annualIncome = scanner.nextFloat();
        if (annualIncome >=1 && annualIncome <= 30) {
            interest = (annualIncome) / 100 / 12;
            break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
             if (period >= 1 && period <= 30)
                break;
                System.out.println("Enter a value between 1 and 30");
            System.out.print(period);
        }

        int payment = period * 12;
        double money = 1 + interest;
        double monthly = Math.pow(money, payment);
        double result = principal
                * (interest * Math.pow(1 + interest, payment)
                / (Math.pow(1 + interest, payment) - 1));
        String currency = NumberFormat.getCurrencyInstance().format(result);
        System.out.print("Mortgage: " + currency);
        String mortgage = scanner.nextLine().trim();
        System.out.print(mortgage);


    }
}
