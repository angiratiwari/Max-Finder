
import java.util.Arrays;

public class GenericMaximum<T extends Comparable<T>> {
    private T value1, value2, value3;

    // Constructor
    public GenericMaximum(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    // Generic method to find the maximum of three values
    public static <T extends Comparable<T>> T findMax(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) max = value2;
        if (value3.compareTo(max) > 0) max = value3;
        return max;
    }

    // Method to print the max value
    public static <T extends Comparable<T>> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }

    // Find max among more than three values
    public static <T extends Comparable<T>> T findMaxMultiple(T[] values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }
}
