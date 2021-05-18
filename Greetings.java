package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
/*
        for ( int i = 0; i < response.length(); i++) {
            if (response.charAt(i) == 'e' && 3 <= response.length() && response.length() < 1000 ) {
                String result = response.replace("e", "ee");
                System.out.print(result);
            }
        }
*/
        if (response.length() >=3 ) {
            String result = response.replace("e", "ee");
            System.out.print(result);
        }



    }
}
