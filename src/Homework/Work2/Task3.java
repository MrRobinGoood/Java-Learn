package Homework.Work2;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();
        int[] array = task1.createArray(10);
        task1.fillArrayByRandom(array, 10, 100);
        task1.printArray(array);

        System.out.println();
        System.out.println("Max number is " + array[task3.maxNumIndex(array)]);
        System.out.println("Min number is " + array[task3.minNumIndex(array)]);

    }

    public int maxNumIndex(int[] array) {
        int maxInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxInd]) {
                maxInd = i;
            }
        }
        return maxInd;
    }

    public int minNumIndex(int[] array) {
        int minInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minInd]) {
                minInd = i;
            }
        }
        return minInd;
    }


}
