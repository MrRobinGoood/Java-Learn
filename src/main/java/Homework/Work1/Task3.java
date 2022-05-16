package Homework.Work1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputValue = input.nextInt();
        System.out.println(task3.isPrime(inputValue));

    }

    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
