package Homework.Work3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void sumOfColumns() {
        Task2 task2 = new Task2();
        int inputData[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected[] = {12, 15, 18};
        int actual[] = task2.sumOfColumns(inputData);
        assertArrayEquals(expected, actual);
    }
}