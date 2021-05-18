package com.company;

import java.util.Scanner;
import java.lang.Math;


public class Pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int total = 0;
        int[] numArr = new int[amount];
        for (int i = 0; i < amount; i++) {
            numArr[i] = scanner.nextInt();
        }
        for(Integer number: numArr){
            int powNumber = number % 10;
            int rootNumber = number/10;
            total += Math.pow(rootNumber,powNumber);
        }
        System.out.println(total);
    }
}
