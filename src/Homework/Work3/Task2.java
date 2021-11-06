package Homework.Work3;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Task1 task1 = new Task1();
        Homework.Work2.Task1 task21 = new Homework.Work2.Task1();
        int[][] array = task1.createMatrix(10, 10);
        array = task1.fillMatrixByRandom(array, 0, 100);
        task1.printMatrix(array);

        System.out.println();
        int[] cloneSumOfLines = task2.sumOfLines(array);
        task21.printArray(cloneSumOfLines);
    }

    public int[] sumOfLines(int[][] array) {
        Homework.Work2.Task1 task21 = new Homework.Work2.Task1();
        int[] arraySumOfLines = task21.createArray(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arraySumOfLines[i] += array[j][i];
            }
        }
        return arraySumOfLines;
    }

}