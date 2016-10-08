package exercise3;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class Controller {
    public static void main(String[] args) {
        Line line = new Line();
        LineUtil.initLine(line);
        LineUtil.printHashMapValue(LineUtil.addToTable(line.getA(),line.getB(),line.getH()));
    }
}
