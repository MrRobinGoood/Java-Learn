package Homework.Work4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        String str = task7.inputString();
        String complete = task6.maxUniqueSymbols(str.trim().split("\\s+"));
        System.out.println("Больше всего уникальных символов в слове " + complete);
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:");
        String str = scanner.nextLine();
        return str;
    }
}
