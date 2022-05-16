package Homework.Work3;

public class Task4 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task4 task4 = new Task4();
        int[][] array = task1.createMatrix(3, 3);
        array = task1.fillMatrixByRandom(array, 0, 10);
        task1.printMatrix(array);
        System.out.println();
        task4.sortingArrayByChoice(array);
        task1.printMatrix(array);
    }

    int[][] sortingArrayByChoice(int[][] array) {
        int indexEnd = array.length * array[0].length;
        for (int i = 0; i < indexEnd - 1; i++) {
            int indexLength = i / array.length, indexWidth = i % array[0].length;
            for (int j = i + 1; j < indexEnd; j++) {
                if (array[indexLength][indexWidth] > array[j / array.length][j % array[0].length]) {
                    int temp = array[j / array.length][j % array[0].length];
                    array[j / array.length][j % array[0].length] = array[indexLength][indexWidth];
                    array[indexLength][indexWidth] = temp;
                }
            }
        }
        return array;
    }
}