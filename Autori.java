package com.company;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        String[] splits = response.split("-");


        for (int i = 0; i < splits.length; i++){
            System.out.print(splits[i].toUpperCase().charAt(0));
        }

    }
}
