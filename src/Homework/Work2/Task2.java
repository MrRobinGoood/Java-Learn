package Homework.Work2;

public class Task2 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        int[] array = task1.createArray(5);
        array = task1.fillArrayByRandom(array, -10, 50);
        task1.printArray(array);
        System.out.println(task2.sumPositiveNumbers(array));
    }

    public int sumPositiveNumbers(int[] number) {
        int sumPosNum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                sumPosNum += number[i];
            }
        }
        return sumPosNum;
    }


}
