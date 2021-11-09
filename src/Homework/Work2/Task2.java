package Homework.Work2;

public class Task2 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        int[] array = task1.createArray(10);
        array = task1.fillArrayByRandom(array, -10, 50);
        task1.printArray(array);

        System.out.println();

        System.out.println("The sum of positive numbers:" + task2.sumPositiveNumbers(array));
    }

    public int sumPositiveNumbers(int[] array) {
        int sumPosNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumPosNum += array[i];
            }
        }
        return sumPosNum;
    }


}
