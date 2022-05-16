package Homework.Work1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        Scanner input = new Scanner(System.in);
        System.out.print("Input diapason start: ");
        int inputStart = input.nextInt();
        System.out.print("Input diapason end: ");
        int inputEnd = input.nextInt();

        System.out.println(task4.sumPrimeNumInDiapason(inputStart, inputEnd));

    }

    public int sumPrimeNumInDiapason(int start, int end) {
        Task3 task3 = new Task3();
        int sumPrimeNumbers = 0;
        for (int i = start; i <= end; i++) {
            if (task3.isPrime(i)) {
                sumPrimeNumbers += i;
            }

        }
        return sumPrimeNumbers;
    }
}




