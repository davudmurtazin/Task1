package exercise8;

import java.util.Arrays;

import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class ArrayUtil {

    public static void beforeArray(Array array1, Array array2) {
        Arrays.sort(array2.getArray());
        for (int i = 0; i < array2.getArray().length; i++) {
            if (array1.getArray()[0] > array2.getArray()[i]) {
                System.out.println("We can paste " + array2.getArray()[i] + " on the " + (i + 1) + " place.");
            }
        }
    }

    public static void insideArray(Array array1, Array array2) {
        for (int i = 0; i < array1.getArray().length - 1; i++) {
            if (array1.getArray()[i + 1] - array1.getArray()[i] >= 0) {
                for (int j = 0; j < array2.getArray().length; j++) {
                    if ((array2.getArray()[j] >= array1.getArray()[i]) && (array2.getArray()[j] <= array1.getArray()[i + 1])) {
                        System.out.println("Paste " + array2.getArray()[j] + " after " + array1.getArray()[i] + " and..");
                    }
                }
            }
        }
    }
}
