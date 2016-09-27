package exercise7;

import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class ArrayUtil {

    public static Array initArray(Array array){
        double[] arrayLocal = new double[]{10.4, 8.1, 3.7, 8.3, 6.4, 12.8, 15.2, 12.7, 10.9};
        array.setArray(arrayLocal);
        return array;
    }

    public static void printSortedArray(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }

    public static double[] sortArray(double[] array) {
        for (int i = 0; i < array.length - 1; ) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i != 0) i--; // back to 1 element
            } else if (i != array.length - 1) i++; // displace to 1 element front
        }
        return array;
    }
}
