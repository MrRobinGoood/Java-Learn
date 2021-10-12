package Homework.Work1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Task2 task2 = new Task2();

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputValue = input.nextInt();

        System.out.println(task.isLucky(inputValue));

        if (task.isLucky(inputValue)) {
            System.out.println(task2.numberSum(inputValue));
        }
    }

    public int numberSum(int number) {
        return (((number / 100) % 10) + ((number / 10) % 10) + (number % 10)) * 2;

    }
}
