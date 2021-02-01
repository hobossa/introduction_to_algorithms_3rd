import java.util.Comparator;

public class BinarySearch {
    /**
     * @return Returns the index of array where array[index] == key,
     * or return -1 if not an item that equals to key exists in array.
     */
    public static <T> int search(T[] array, T key, Comparator<T> comp) {
        int min = 0;
        int max = array.length - 1;
        int guess = 0;
        while (min <= max) {
            guess = (min + max) / 2;
            int c = comp.compare(array[guess], key);
            if (0 == c) {
                return guess;
            } else if (c < 0) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }
}
