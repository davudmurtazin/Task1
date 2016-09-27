package exercise6;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class MatrixUtil {

    //функция смещение на 1 влево
    public int[] leftDisplace(int array[], int arrayLenght) {
        int temp = array[0];
        for (int i = 0; i < arrayLenght - 1; i++) {
            array[i] = array[i + 1];
        }
        array[arrayLenght - 1] = temp;
        return array;
    }

    public void createMatrix(){
        int[] array = new int[]{6,7,8,9,3};
        int[][] matrix = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            matrix[i] = array.clone();
            array = leftDisplace(array, array.length);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}