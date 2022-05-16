package Homework.Work1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void isLucky() {
        Task1 task1 = new Task1();
        boolean actual = task1.isLucky(123321);
        assertTrue(actual);
    }
}