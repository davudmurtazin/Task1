package exercise12;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int etition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEtition() {
        return etition;
    }

    public static void setEtition(int etition) {
        Book.etition = etition;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        Book book = (Book)obj;
         if(title == book.getTitle()){
             return true;
         }
        if(price == book.getPrice()){
            return true;
        }
        if(author == book.getAuthor()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Title= " + title + ", Author= " + author + ", Price= " + price;
    }
}
