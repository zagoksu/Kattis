package com.company;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cases = scan.nextInt();
//        int cases = Integer.parseInt(scanner.nextLine());
        scan.nextLine();

        for (int i = 0; i < cases; i++) {
            String str = scan.nextLine();

            if (str.startsWith("Simon says"))
                System.out.println(str.substring(10));
        }

        scan.close();
    }
}