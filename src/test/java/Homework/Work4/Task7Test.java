package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void maxUniqueInStr() {
        Task7 task7 = new Task7();
        String actual = task7.maxUniqueInStr("qqe qwe qww eeq");
        String expected = "qwe";
        assertEquals(expected, actual);
    }
}