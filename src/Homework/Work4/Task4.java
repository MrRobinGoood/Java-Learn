package Homework.Work4;

import Homework.Work2.Task1;

public class Task4 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();
        Task4 task4 = new Task4();
        String str = "a1b23c4%&50";
        String completeStr = task3.createOnlyNumbersStr(str);
        int[] array = task3.createArrayOfNumbers(completeStr);
        task1.printArray(array);
        task4.sumArrayNumbers(array);
        System.out.println("\nСумма цифр строки = " + task4.sumArrayNumbers(array));
    }

    public int sumArrayNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }
}
