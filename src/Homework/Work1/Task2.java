package Homework.Work1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Task1 task = new Task1();
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int inputValue = input.nextInt();

        System.out.println(task.isLucky(inputValue));
    }
}
