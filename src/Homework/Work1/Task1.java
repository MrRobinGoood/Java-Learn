package Homework.Work1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputValue = input.nextInt();

        System.out.println(task.isLucky(inputValue));
    }

    public boolean isLucky(int number) {
        int partNumber1, partNumber2, sumPart1, sumPart2;
        partNumber1 = number / 1000;
        partNumber2 = number % 1000;
        sumPart1 = (partNumber1 / 100) + ((partNumber1 / 10) % 10) + (partNumber1 % 10);
        sumPart2 = (partNumber2 / 100) + ((partNumber2 / 10) % 10) + (partNumber2 % 10);
        return (sumPart1 == sumPart2);


    }
}
