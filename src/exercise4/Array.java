package exercise4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Array {
    private static List<Integer> array = new ArrayList<>();

    public Array() {
    }

    public List<Integer> getArray() {
        return array;
    }

    public void addElementToArray(int elementOfArray) {
        array.add(elementOfArray);
    }
}
