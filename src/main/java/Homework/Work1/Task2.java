package Homework.Work1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Scanner input = new Scanner(System.in);
        System.out.print("Input diapason start: ");
        int inputStart = input.nextInt();
        System.out.print("Input diapason end: ");
        int inputEnd = input.nextInt();

        System.out.println(task2.sumLuckyNumInDiapason(inputStart, inputEnd));

    }

    public int sumLuckyNumInDiapason(int start, int end) {
        Task1 task = new Task1();
        int sumLuckyNumbers = 0;
        for (int i = start; i <= end; i++) {
            if (task.isLucky(i)) {
                sumLuckyNumbers += i;
            }
        }
        return sumLuckyNumbers;

    }

}
