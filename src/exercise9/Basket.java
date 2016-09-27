package exercise9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}
