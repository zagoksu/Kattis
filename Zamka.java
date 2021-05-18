package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int D = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayList<Integer> min = new ArrayList<Integer>();
        for (int i = L; i <= D; i++){
            if (sumOfDigits(i) == X) {
                min.add(i);
            }
        }
        ArrayList<Integer> max = new ArrayList<Integer>();
        for (int i = D; i >= L; i--){
            if(sumOfDigits(i) == X){
                max.add(i);
            }
        }
        System.out.println(min.get(0));
        System.out.println(max.get(0));
    }

    public static int sumOfDigits (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


}
