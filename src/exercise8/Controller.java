package exercise8;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Controller {
    public static void main(String[] args) {
        double[] arrayLocal1 = new double[]{10.4, 8.1, 3.7, 8.3, 6.4, 12.8, 15.2, 12.7, 10.9};
        double[] arrayLocal2 = new double[]{2.4, 3.7, 9.7, 4.3, 5.1, 18.2, 6.3, 1.2, 8.1};
        Array array1 = new Array(arrayLocal1);
        Array array2 = new Array(arrayLocal2);
        ArrayUtil.checkArray(array1,array2);
    }
}
