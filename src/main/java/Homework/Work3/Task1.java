package Homework.Work3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Homework.Work2.Task1 task21 = new Homework.Work2.Task1();
        int[][] array = task1.createMatrix(10, 10);
        array = task1.fillMatrixByRandom(array, 0, 100);
        task1.printMatrix(array);

        System.out.println();
        int[] cloneSumOfLines = task1.sumOfLines(array);
        task21.printArray(cloneSumOfLines);
    }

    public int[] sumOfLines(int[][] array) {
        Homework.Work2.Task1 task21 = new Homework.Work2.Task1();
        int[] arraySumOfLines = task21.createArray(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arraySumOfLines[i] += array[i][j];
            }
        }
        return arraySumOfLines;
    }

    public int[][] createMatrix(int length, int width) {
        int[][] array = new int[length][width];
        return array;
    }

    public int[][] fillMatrixByRandom(int[][] array, int startRnd, int endRnd) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(endRnd - startRnd) + startRnd;
            }
        }
        return array;
    }

    public void printMatrix(int[][] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%2d", array[i][j]);
                if (j + 1 < array.length) {
                    System.out.print(", ");
                }
            }

            System.out.println();

        }
        System.out.print("]");
    }

}
