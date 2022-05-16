package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void maxUniqueSymbols() {
        Task6 task6 = new Task6();
        String[] inputData = {"aaaaaa", "aaabbb", "aaaaabc"};
        String actual = task6.maxUniqueSymbols(inputData);
        String expected = "aaaaabc";
        assertEquals(expected, actual);
    }
}