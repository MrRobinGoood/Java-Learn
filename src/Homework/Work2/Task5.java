package Homework.Work2;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();

        Task1 task1 = new Task1();
        int[] array = task1.createArray(5);
        task1.fillArrayByRandom(array, 0, 100);
        task1.printArray(array);

        System.out.println();
        System.out.println(task5.arithmeticalMeanFromMaxToMin(array));
    }

    public float arithmeticalMeanFromMaxToMin(int[] array) {
        Task3 task3 = new Task3();
        int maxInd = task3.maxNumIndex(array), minInd = task3.minNumIndex(array);
        float sumOfDiapason = 0;

        if (maxInd > minInd) {
            for (int i = minInd; i <= maxInd; i++) {
                sumOfDiapason += array[i];
            }
            sumOfDiapason = sumOfDiapason / (maxInd - minInd + 1);
        } else {
            for (int i = maxInd; i <= minInd; i++) {
                sumOfDiapason += array[i];
            }
            sumOfDiapason = sumOfDiapason / (minInd - maxInd + 1);
        }
        return sumOfDiapason;
    }

}
