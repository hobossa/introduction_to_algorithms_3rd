import java.util.Comparator;

public class DefaultComparator<T> implements Comparator<T> {
    @SuppressWarnings("unchecked")
    @Override
    public int compare(T o1, T o2) throws ClassCastException{
        return ((Comparable<T>) o1).compareTo(o2);
    }
}
