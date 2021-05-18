package com.company;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number1 = scanner.next();
        String number2 = scanner.next();

        char ch1[]=number1.toCharArray();
        String rev1="";
        for(int i=ch1.length-1;i>=0;i--){
            rev1+=ch1[i];
        }

        char ch2[]=number2.toCharArray();
        String rev2="";
        for(int i=ch2.length-1;i>=0;i--){
            rev2+=ch2[i];
        }

        int num1 = Integer.parseInt(rev1);
        int num2 = Integer.parseInt(rev2);

        System.out.println(Math.max(num1,num2));

    }
}
