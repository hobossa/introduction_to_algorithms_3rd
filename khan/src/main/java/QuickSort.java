import java.util.Comparator;

public class QuickSort {
    public static <T> void sort(T[] array, Comparator<T> comp) {
        sort(array, 0, array.length - 1, comp);
    }

    private static <T> void sort(T[] array, int p, int r, Comparator<T> comp) {
        if (p < r) {
            int i = partition(array, p, r, comp);
            sort(array, p, i - 1, comp);
            sort(array, i + 1, r, comp);
        }
    }

    /**
     * Partitions the array.
     *
     * @return the index of pivot.
     */
    private static <T> int partition(T[] array, int p, int r, Comparator<T> comp) {
        int q = p;
        int j = p;
        for (; j < r; j++) {
            if (comp.compare(array[j], array[r]) <= 0) {
                Util.swap(array, j, q++);
            }
        }
        Util.swap(array, q, r);
        return q;
    }
}
