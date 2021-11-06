package Homework.Work2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 application = new Task1();
        int[] array = application.createArray(5);
        array = application.fillArrayByRandom(array);
        application.printArray(array);
    }

    public int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public int[] fillArrayByRandom(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
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


