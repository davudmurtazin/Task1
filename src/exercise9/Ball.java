package exercise9;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Ball {
    private double weight;
    private String color;
    String a = "abc";
    String b = "abc";

    public Ball(){
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
