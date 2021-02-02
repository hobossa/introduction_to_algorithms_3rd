import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        final int n = 10;
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        for (int i = 0; i < n; i++) {
            assertEquals(i, BinarySearch.search(array, i, new DefaultComparator<Integer>()));
        }
        assertEquals(-1, BinarySearch.search(array, -1, new DefaultComparator<Integer>()));
        assertEquals(-1, BinarySearch.search(array, n, new DefaultComparator<Integer>()));
    }
}