package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void searchAndCollectUppercaseLettersOfStr() {
        Task2 task2 = new Task2();
        String actual = task2.searchAndCollectUppercaseLettersOfStr("RTrew124737GH");
        String expected = "RTGH";
        assertEquals(expected, actual);
    }
}