import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sort() {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }
        Comparator<Integer> comp = new DefaultComparator<Integer>();
        InsertionSort.sort(array, comp);
        for (int i = 0; i < 9; i++) {
            int c = comp.compare(array[i], array[i+1]);
            assertTrue(c <= 0);
        }
    }
}