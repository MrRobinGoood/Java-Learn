package Homework.Work4;

import Homework.Work2.Task1;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();
        String str = "a1b23c4%&50";
        String completeStr = task3.createOnlyNumbersStr(str);
        int[] arr = task3.createArrayOfNumbers(completeStr);
        task1.printArray(arr);
    }

    public String createOnlyNumbersStr(String str) {
        char[] array = str.toCharArray();
        String recordStr = new String();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(array[i])) {
                recordStr += array[i];
            }
        }
        return recordStr;
    }

    public int[] createArrayOfNumbers(String Str) {
        char[] arrayNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] array = Str.toCharArray();
        int[] recordArray = new int[Str.length()];
        for (int i = 0; i < Str.length(); i++) {
            for (int j = 0; j < arrayNumbers.length; j++) {
                if (array[i] == arrayNumbers[j]) {
                    recordArray[i] = j;
                }
            }
        }
        return recordArray;
    }

}
