package Homework.Work2;

public class Task4 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();
        int[] array = task1.createArray(10);
        task1.fillArrayByRandom(array, 10, 100);
        task1.printArray(array);

        System.out.println();

        int maxInd, minInd, maxNum;
        maxInd = task3.maxNumIndex(array);
        minInd = task3.minNumIndex(array);
        maxNum = array[maxInd];
        array[maxInd] = array[minInd];
        array[minInd] = maxNum;
        task1.printArray(array);
    }


}
