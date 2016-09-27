package exercise7;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Array array = new Array();
        ArrayUtil.initArray(array);
        double [] sortedArray = ArrayUtil.sortArray(array.getArray());
        ArrayUtil.printSortedArray(sortedArray);
    }
}
