package Homework.Work1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Task3 task3 = new Task3();
        int sumPrimeNumbers = 0;
        for (int i = 1000; i <= 2000; i++) {
            if (task3.isPrime(i)) {
                sumPrimeNumbers += i;
            }

        }
        System.out.println(sumPrimeNumbers);


    }

}




