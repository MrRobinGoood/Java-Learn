package Homework.Work4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void createOnlyNumbersStr() {
        Task3 task3 = new Task3();
        String actual = task3.createOnlyNumbersStr("Regfsy3g45ghUT0");
        String expected = "3450";
        assertEquals(expected, actual);
    }
}