package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void searchUniqueSymbols() {
        Task5 task5 = new Task5();
        String actual = task5.searchUniqueSymbols("aaabbbcdddF");
        String expected = "abcdF";
        assertEquals(expected, actual);
    }
}