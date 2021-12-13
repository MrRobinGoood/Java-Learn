package Homework.Work3;

public class Task4 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task4 task4 = new Task4();
        int[][] array = task1.createMatrix(3, 3);
        array = task1.fillMatrixByRandom(array, 0, 10);
        task1.printMatrix(array);
/*
        System.out.println();
        task4.sortingArrayByChoice(array);
        task1.printMatrix(array);
 */
    }

/*
    public void sortingArrayByChoice(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int minNumOfArray = array[i][j];

                for (int k = array.length-1; k>i ; k--) {
                    for (int l = array.length-1; l>j ; l--) {
                if (array[k][l]<minNumOfArray){
                    minNumOfArray = array[k][l];
                }
                }
                    }
                System.out.println(minNumOfArray);
            }
        }
    }
*/
}