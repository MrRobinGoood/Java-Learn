package Homework.Work1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task1 task = new Task1();


        int sumLuckyNumbers = 0;
        for (int i = 100000; i < 1000000; i++) {
            if (task.isLucky(i)) {
                sumLuckyNumbers += i;
            }

        }
        System.out.println(sumLuckyNumbers);
    }
}
