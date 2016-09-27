package exercise14;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int etition;

    public Book clone() throws CloneNotSupportedException{
       try{
            Book obj=(Book)super.clone();
            obj.title = title;
            obj.author = author;
            obj.price = price;
            return obj;
       }catch( CloneNotSupportedException ex ) {
            throw new InternalError();
        }
    }
}
