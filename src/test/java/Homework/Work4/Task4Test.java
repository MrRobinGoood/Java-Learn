package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void sumArrayNumbers() {
        Task4 task4 = new Task4();
        int inputData[] = {1, 2, 3, 4, 5};
        int actual = task4.sumArrayNumbers(inputData);
        int expected = 15;
        assertEquals(expected, actual);
    }
}