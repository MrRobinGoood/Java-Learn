package Homework.Work2;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task1 task1 = new Task1();
        int[] array = task1.createArray(5);
        task1.fillArrayByRandom(array, 0, 100);
        task1.printArray(array);

        System.out.println();
        System.out.println("Max number is " + task3.maxNumberAndIndex(array)[0]);
        System.out.println("Min number is " + task3.minNumberAndIndex(array)[0]);

    }

    public int[] maxNumberAndIndex(int[] array) {
        int maxNum = array[0], maxInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxInd = i;
                maxNum = array[i];
            }
        }
        int[] maxNumAndInd = new int[]{maxNum, maxInd};
        return maxNumAndInd;
    }

    public int[] minNumberAndIndex(int[] array) {
        int minNum = array[0], minInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minInd = i;
                minNum = array[i];
            }
        }
        int[] minNumAndInd = new int[]{minNum, minInd};
        return minNumAndInd;
    }
}
