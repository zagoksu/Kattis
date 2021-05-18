package com.company;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j ++){
                int contestant1 = sc.nextInt();
                int contestant2 = sc.nextInt();
                int contestant3 = sc.nextInt();
                int contestant4 = sc.nextInt();
                int contestant5 = sc.nextInt();
                sum1 += contestant1;
                sum2 += contestant2;
                sum3 += contestant3;
                sum4 += contestant4;
                sum5 += contestant5;
            }


        }
        System.out.println(Math.max(sum1, Math.max(sum2, Math.max(sum3, Math.max(sum4,sum5)))));
    }
}
