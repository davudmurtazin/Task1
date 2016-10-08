package exercise4;

import java.util.ArrayList;
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

    public static ArrayList<Integer> getIndexesOfPrimeNumbers(List<Integer> array){
        ArrayList<Integer> indexes = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            if (isPrime(array.get(i))) {
                counter++;
                indexes.add(i);
                System.out.println("Index of prime number " + array.get(i) + " is : " + i);
            }
        }
        if(counter == 0){
            System.out.println("Array doesn't have prime numbers!");
        }
        return indexes;
    }

    public static boolean isPrime(int value){
        boolean check = true;
        int limit = (int) Math.sqrt(value);

        for (int i = 2; i <= limit; i++) {
            if (value % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
