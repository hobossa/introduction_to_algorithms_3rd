import java.util.Comparator;

public class SelectionSort {
    public static <T> void sort(T[] array, Comparator<T> comp) {
        for (int i = 0; i < array.length; i++) {
            int n = indexOfMiniItem(array, i, comp);
            swap(array, i, n);
        }
    }

    private static <T> int indexOfMiniItem(T[] array, int i, Comparator<T> comp) {
        int n = i;
        for (int j = n+1; j < array.length; j++) {
            if (comp.compare(array[j], array[n]) < 0) {
                n = j;
            }
        }
        return n;
    }

    private static <T> void swap(T[] array, int m, int n) {
        T temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }
}
