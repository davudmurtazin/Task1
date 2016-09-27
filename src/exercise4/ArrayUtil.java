package exercise4;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class ArrayUtil {

    public static Array initArray(Array array){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int dimension = sc.nextInt();

        for( int i = 0; i < dimension; i++){
            System.out.println("Enter " + i + " element of array: ");
            int element = sc.nextInt();
            array.addElementToArray(element);
        }
        return array;
    }

    public static void getIndexesOfPrimeNumbers(List<Integer> array){
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                counter++;
                System.out.println("Index of prime number " + array.get(++i) + " is : " + ++i);
            }
        }
        if(counter == 0){
            System.out.println("Array doesn't have prime numbers!");
        }
    }
}
