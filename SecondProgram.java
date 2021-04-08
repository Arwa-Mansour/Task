/*
 Write generic method to merge tow arrays of any type
 */
import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;
public class SecondProgram {

    public static <T> Object[] concatenate(T[] a, T[] b)
    {
        // Function to merge two arrays of
        // same type
        return Stream.of(a, b)
                .flatMap(Stream::of)
                .toArray();

        // Arrays::stream can also be used in place
        // of Stream::of in the flatMap() above.
    }

    public static void main (String[] args)
    {
        Integer[] a = new Integer[]{1,2,3};
        Integer[] b = new Integer[]{4,5,6};

        Object[] c = concatenate(a,b);

        System.out.println("The first array is:  [ 1 , 2 , 3 ]");
        System.out.println("The Second array is: [ 4 , 5 , 6 ]");
        System.out.println("Merged object array  is : "
                + Arrays.toString(c));
    }
}
