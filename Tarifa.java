package com.company;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthlyData = scanner.nextInt();
        int numOfMonths = scanner.nextInt();
        int sum = 0;
        int dif = 0;
        for (int i = 0; i < numOfMonths; i++){

           int usedData =  scanner.nextInt();
           sum += usedData;
           dif = monthlyData * (i +1+1) -sum;

        }
        System.out.println(dif);
    }
}
