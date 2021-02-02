import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sort() {
        final int n = 10;
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        Comparator<Integer> comp = new DefaultComparator<Integer>();
        InsertionSort.sort(array, comp);
        for (int i = 0; i < n - 1; i++) {
            int c = comp.compare(array[i], array[i + 1]);
            assertTrue(c <= 0);
        }
    }
}