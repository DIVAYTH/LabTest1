package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BucketSortTest {

    @Test
    void unsortedArrayTest() {
        int[] arr = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(expected, BucketSort.sort(arr));
    }

    @Test
    void equalArrayElementsTest() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0 ,0};
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0 ,0};
        Assertions.assertArrayEquals(expected, BucketSort.sort(arr));
    }

    @Test
    void sortedArrayTest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertArrayEquals(expected, BucketSort.sort(arr));
    }

    @Test
    void twoElementsTest() {
        int[] arr = {2, 1};
        int[] expected = {1, 2};
        Assertions.assertArrayEquals(expected, BucketSort.sort(arr));
    }

    @Test
    void oneElementTest() {
        int[] arr = {1};
        int[] expected = {1};
        Assertions.assertArrayEquals(expected, BucketSort.sort(arr));
    }

    @Test
    void emptyArrayTest() {
        int[] arr = {};
        int[] expected = {};
        Assertions.assertArrayEquals(expected, BucketSort.sort(arr));
    }
}