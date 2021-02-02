import java.util.Comparator;

public class MergeSort {
    @SuppressWarnings("unchecked")
    private static <T> void merge(T[] array, int p, int q, int r, Comparator<T> comp) {
        T[] low = (T[]) (new Object[q - p + 1]);
        T[] high = (T[]) (new Object[r - q]);
        for (int i = 0; i < low.length; i++) {
            low[i] = array[p + i];
        }
        for (int i = 0; i < high.length; i++) {
            high[i] = array[q + 1 + i];
        }

        int k = p;
        int i = 0;
        int j = 0;
        while (i < low.length && j < high.length) {
            if (comp.compare(low[i], high[j]) < 0) {
                array[k++] = low[i++];
            } else {
                array[k++] = high[j++];
            }
        }
        while (i < low.length) {
            array[k++] = low[i++];
        }
        while (j < high.length) {
            array[k++] = high[j++];
        }
    }

    private static <T> void sort(T[] array, int p, int r, Comparator<T> comp) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(array, p, q, comp);
            sort(array, q + 1, r, comp);
            merge(array, p, q, r, comp);
        }
    }

    public static <T> void sort(T[] array, Comparator<T> comp) {
        sort(array, 0, array.length - 1, comp);
    }
}
