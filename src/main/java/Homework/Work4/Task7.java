package Homework.Work4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        String complete = task7.maxUniqueInStr(task7.inputString());
        System.out.println("Больше всего уникальных символов в слове " + complete);
    }

    public String maxUniqueInStr(String str) {
        Task6 task6 = new Task6();
        String complete = task6.maxUniqueSymbols(str.trim().split("\\s+"));
        return complete;
    }

    public String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:");
        String str = scanner.nextLine();
        return str;
    }
}
