package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void arrayString() {
        Task1 task1 = new Task1();
        String[] actual = task1.arrayString("abcd");
        String[] expected = {"a", "ab", "abc", "abcd"};
        assertArrayEquals(expected, actual);
    }
}