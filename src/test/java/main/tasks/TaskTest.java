package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void test_findNthPrime() {
        assertEquals(2, Task.findNthPrime(1));
        assertEquals(3, Task.findNthPrime(2));
        assertEquals(29, Task.findNthPrime(10));
        assertEquals(71, Task.findNthPrime(20));
    }

    @Test
    void test_countLetterInText() {
        assertEquals(0, Task.countLetterInText("kiscica", '*'));
        assertEquals(1, Task.countLetterInText("kiscica", 'k'));
        assertEquals(1, Task.countLetterInText("kiscica", 's'));
        assertEquals(2, Task.countLetterInText("kiscica", 'c'));
        assertEquals(5, Task.countLetterInText("*****", '*'));
    }

    @Test
    void test_countElemInArray() {
        int[] array = {1, 2, 3, 4, 4, 5, 4, 3, 2, 1};

        assertEquals(0, Task.countElemInArray(array, -1));
        assertEquals(1, Task.countElemInArray(array, 5));
        assertEquals(2, Task.countElemInArray(array, 1));
        assertEquals(3, Task.countElemInArray(array, 4));
    }

    @Test
    void test_findMostFrequentElem() {
        int[] array1 = {1};
        assertEquals(1, Task.findMostFrequentElem(array1));

        int[] array2 = {1, 2, 1, 2, 1};
        assertEquals(1, Task.findMostFrequentElem(array2));

        int[] array3 = {2, 1, 2, 2, 1, 1};
        assertEquals(2, Task.findMostFrequentElem(array3));

        int[] array4 = {1, 2, 3, 2, 3, 4, 4, 5, 4, 4, 5, 3, 1, 4};
        assertEquals(4, Task.findMostFrequentElem(array4));
    }

    @Test
    void test_findLonelyElem() {
        int[] array1 = {5};
        assertEquals(5, Task.findLonelyElem(array1));

        int[] array2 = {5, 1, 5};
        assertEquals(1, Task.findLonelyElem(array2));

        int[] array3 = {3, 2, 2};
        assertEquals(3, Task.findLonelyElem(array3));

        int[] array4 = {2, 2, 3};
        assertEquals(3, Task.findLonelyElem(array4));

        int[] array5 = {42, 33, 33, -42, 66, 69, 33, 42, 5, 69, 5, 33, -42};
        assertEquals(66, Task.findLonelyElem(array5));
    }
}