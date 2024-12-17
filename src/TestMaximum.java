import java.util.Scanner;
public class TestMaximum {
    // UC-1: Integer Maximum Test
    public static void testIntegerMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        Integer value1 = scanner.nextInt();
        Integer value2 = scanner.nextInt();
        Integer value3 = scanner.nextInt();

        Integer max = GenericMaximum.findMax(value1, value2, value3);
        GenericMaximum.printMax(max);
    }

    // UC-2: Float Maximum Test
    public static void testFloatMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three floats: ");
        Float value1 = scanner.nextFloat();
        Float value2 = scanner.nextFloat();
        Float value3 = scanner.nextFloat();

        Float max = GenericMaximum.findMax(value1, value2, value3);
        GenericMaximum.printMax(max);
    }

    // UC-3: String Maximum Test
    public static void testStringMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three strings: ");
        String value1 = scanner.next();
        String value2 = scanner.next();
        String value3 = scanner.next();

        String max = GenericMaximum.findMax(value1, value2, value3);
        GenericMaximum.printMax(max);
    }

    // UC-4: Test Max for More Than Three Inputs
    public static void testMaxMultiple() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int n = scanner.nextInt();
        Integer[] values = new Integer[n];

        System.out.println("Enter the values: ");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        Integer max = GenericMaximum.findMaxMultiple(values);
        GenericMaximum.printMax(max);
    }
}
