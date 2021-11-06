package Homework.Work3;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[][] array = task1.createArray(10, 10);
        array = task1.fillArrayByRandom(array, 0, 100);
        task1.printArray(array);
    }

    public int[][] createArray(int length, int width) {
        int[][] array = new int[length][width];
        return array;
    }

    public int[][] fillArrayByRandom(int[][] array, int startRnd, int endRnd) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(endRnd - startRnd) + startRnd;
            }

        }
        return array;
    }

    public void printArray(int[][] array) {
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
