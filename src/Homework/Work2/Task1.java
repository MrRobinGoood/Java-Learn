package Homework.Work2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] array = task1.createArray(5);
        array = task1.fillArrayByRandom(array, 10, 100);
        task1.printArray(array);
    }

    public int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public int[] fillArrayByRandom(int[] array, int startRnd, int endRnd) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(endRnd - startRnd) + startRnd;
        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}


