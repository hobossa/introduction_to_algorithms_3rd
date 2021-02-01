import java.util.Comparator;

public class SelectionSort {
    public static <T> void sort(T[] array, Comparator<T> comp) {
        for (int i = 0; i < array.length; i++) {
            int n = i;
            for (int j = i; j < array.length; j++) {
                if (comp.compare(array[j], array[n]) < 0) {
                    n = j;
                }
            }
            swap(array, i, n);
        }
    }

    private static <T> void swap(T[] array, int m, int n) {
        T temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
}
