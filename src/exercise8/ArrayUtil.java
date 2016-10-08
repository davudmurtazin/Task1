package exercise8;

import java.util.Arrays;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class ArrayUtil {

    public static void checkArray(Array array1, Array array2) {
        for (int i = 0; i < array2.getArray().length; i++) {
            System.out.println("We can paste " + array2.getArray()[i] + " on the " + Arrays.binarySearch(array1.getArray(), array2.getArray()[i]) + " place.");
        }
    }
}
