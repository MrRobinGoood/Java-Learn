package Homework.Work3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void sumOfLines() {
        Task1 task1 = new Task1();
        int inputData[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected[] = task1.sumOfLines(inputData);
        int actual[] = {6, 15, 24};
        assertArrayEquals(expected, actual);
    }
}