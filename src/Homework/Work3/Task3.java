package Homework.Work3;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();

        int[][] array = task1.createMatrix(3, 3);
        array = task1.fillMatrixByRandom(array, 0, 2);
        task1.printMatrix(array);

        System.out.println();
        if ((task3.isEqualSumLines(array) != -1) && (task3.isEqualSumColumns(array) != -1) && (task3.isEqualSumDiagonals(array) != -1) && (task3.isEqualSumLines(array) == task3.isEqualSumColumns(array)) && (task3.isEqualSumLines(array) == task3.isEqualSumDiagonals(array))) {
            System.out.println("This Matrix is Magic");
        } else {
            System.out.println("This Matrix Not Magic");
        }
       /* Вывод значений, если суммы равны то выводит саму сумму, если суммы не равны, выводит -1
        System.out.println(task3.isEqualSumLines(array));
        System.out.println(task3.isEqualSumColumns(array));
        System.out.println(task3.isEqualSumDiagonals(array));
        */

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

    public int[] sumMainDiagonalAndSumSideDiagonal(int[][] array) {
        Homework.Work2.Task1 task21 = new Homework.Work2.Task1();
        int[] arraySumMainAndSumSideDiagonals = task21.createArray(array.length);
        for (int i = 0; i < array.length; i++) {
            arraySumMainAndSumSideDiagonals[0] += array[i][i];
        }
        for (int i = 0; i < array.length; i++) {
            arraySumMainAndSumSideDiagonals[1] += array[i][array.length - 1 - i];
        }
        return arraySumMainAndSumSideDiagonals;
    }

    public int isEqualSumDiagonals(int[][] array) {
        Task3 task3 = new Task3();
        int[] sumMainAndSumSideDiagonals = task3.sumMainDiagonalAndSumSideDiagonal(array);
        if (sumMainAndSumSideDiagonals[0] != sumMainAndSumSideDiagonals[1]) {
            return -1;

        } else {
            return sumMainAndSumSideDiagonals[0];
        }
    }

}
