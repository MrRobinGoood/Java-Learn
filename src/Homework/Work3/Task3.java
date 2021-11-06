package Homework.Work3;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix(3, 3);
        array = task1.fillMatrixByRandom(array, 0, 2);
        task1.printMatrix(array);

        System.out.println();
        System.out.println(task3.isEqualSumLines(array));
        System.out.println(task3.isEqualSumColumns(array));
    }

    public int isEqualSumLines(int[][] array) {
        Task1 task1 = new Task1();
        int[] arraySumOfLines = task1.sumOfLines(array);
        for (int i = 0; i < arraySumOfLines.length - 1; i++) {
            if (arraySumOfLines[i] != arraySumOfLines[i + 1]) {
                return -1;
            }
        }
        return arraySumOfLines[0];
    }

    public int isEqualSumColumns(int[][] array) {
        Task2 task2 = new Task2();
        int[] arraySumOfColumns = task2.sumOfColumns(array);
        for (int i = 0; i < arraySumOfColumns.length - 1; i++) {
            if (arraySumOfColumns[i] != arraySumOfColumns[i + 1]) {
                return -1;
            }
        }
        return arraySumOfColumns[0];
    }

    public int isEqualSumMainDiagonal(int[][] array) {
        int sumMainDiagonal
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {

                }
            }

        }
    }

}
