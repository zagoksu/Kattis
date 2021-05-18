package com.company;

import java.util.Scanner;

public class Planina {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int side = (int) (Math.pow(2, number)+ 1);
        System.out.println(side * side);
    }
}
