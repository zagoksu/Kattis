package com.company;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clickCount = scanner.nextInt();
        int previousTime = 0;
        int accumulatedTime = 0;
        boolean isRunning = false;

            for (int i = 0; i < clickCount; i++){
                int currentTime = scanner.nextInt();
                if(isRunning){
                    accumulatedTime += (currentTime - previousTime);
                }
                isRunning = true;
                previousTime = currentTime;


            }
            if (isRunning){
                System.out.println("still running");
            } else{
                System.out.println(accumulatedTime);
            }
            }
        }


