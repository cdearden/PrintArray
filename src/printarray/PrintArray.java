package printarray;

public class PrintArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] intArr = {2, 7, 73, 43, 9, 6, 2, 1, 5, 3, 8, 3, 3, 6, 8, 34,
            21, 1, 5};
        Double[] fltArr = {6.7, 7.8, 73.9, 43.1, 9.4, 6.7, 2.6, 1.7, 5.5, 3.1,};
        Character[] charArr = {'d', 'e', 'r', 'q', 'w', 'e', 'r', 't', 'f', 'q',
            'i'};
        String[] sArr = {"I", "like", "generics!"};


        /*
         * Try print method.
         */
        print(intArr);
        System.out.println();
        print(fltArr);
        System.out.println();
        print(charArr);
        System.out.println();
        print(sArr);
        System.out.println();

        /*
         * Try overloaded method.
         */
        try {
            print(intArr, 5, 10);
            System.out.println();
            print(fltArr, 0, 5);
            System.out.println();
            print(charArr, 3, 6);
            System.out.println();
            print(sArr, 2, 2);
            System.out.println();
        } catch (InvalidSubscriptException ex) {
            System.out.println(ex.getMessage());
        }

    }

    /**
     * Prints values of a generic array.
     *
     * @param <T>
     * @param array Generic array to print.
     */
    private static <T> void print(T[] array) {
        for (T element : array) 
            System.out.print(element + " ");
    }

    /**
     * Prints values from <code>start</code> to <code>end</code>.
     *
     * @param <T>
     * @param array Generic array to print.
     * @param start Index to start printing values from.
     * @param end Index of last value to be printed.
     * @throws InvalidSubscriptException If the <code>start</code> and <code>end
     * </code> values are out of bounds or <code>start</code> is greater than
     * <code>end</code>.
     */
    private static <T> void print(T[] array, int start, int end) throws
            InvalidSubscriptException {
        if (start < 0 || start > end || array.length <= end)
            throw new InvalidSubscriptException();

        for (int i = start; i <= end; i++) 
            System.out.print(array[i] + " ");
    }
}
