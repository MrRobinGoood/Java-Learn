package Homework.Work4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        String[] strArray = task6.takeStringArray();
        String completeStr = task6.maxUniqueSymbols(strArray);
        System.out.println(completeStr);
    }

    public String[] takeStringArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int arrayLength = in.nextInt();
        String[] strArray = new String[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Заполните строку №%d: ", i + 1);
            strArray[i] = in.next();
        }
        return strArray;
    }

    public String maxUniqueSymbols(String[] str) {
        Task5 task5 = new Task5();
        String complete = "";
        String firstComplete;
        String[] uniqueArray = new String[str.length];
        for (int i = 0; i < uniqueArray.length; i++) {
            uniqueArray[i] = task5.searchUniqueSymbols(str[i]);
        }
        for (int i = 1; i < uniqueArray.length; i++) {
            for (int j = 1; j < uniqueArray.length; j++) {
                if (uniqueArray[i].length() > uniqueArray[j].length()) {
                    firstComplete = str[i];
                } else firstComplete = str[j];
                if (firstComplete.length() > complete.length()) {
                    complete = firstComplete;
                }
            }
        }
        return complete;
    }
}
