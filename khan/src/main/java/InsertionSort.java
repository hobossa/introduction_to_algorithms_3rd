import java.util.Comparator;

public class InsertionSort {
    public static <T> void sort(T[] array, Comparator<T> comp) {
        for (int i = 1; i < array.length; i++) {
            insert(array, i-1, array[i], comp);
        }
    }

    private static <T> void insert(T[] array, int rightIndex, T value, Comparator<T> comp) {
        int i;
        for (i = rightIndex;
             i >= 0 & comp.compare(value, array[i]) < 0;
             i--) {
            array[i+1] = array[i];
        }
        array[i+1] = value;
    }
}
