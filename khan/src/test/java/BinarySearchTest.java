import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(i, BinarySearch.search(array, i, new DefaultComparator<Integer>()));
        }
        assertEquals(-1, BinarySearch.search(array, -1, new DefaultComparator<Integer>()));
        assertEquals(-1, BinarySearch.search(array, 10, new DefaultComparator<Integer>()));
    }
}