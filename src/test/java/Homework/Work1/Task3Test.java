package Homework.Work1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void isPrime() {
        Task3 task3 = new Task3();
        boolean actual = task3.isPrime(17);
        assertTrue(actual);
    }
}