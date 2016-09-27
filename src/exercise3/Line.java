package exercise3;

import java.util.LinkedHashMap;

/**
 * Created by Davud_Murtazin on 9/26/2016.
 */
public class Line {
    private double a;
    private double b;
    private double h;

    public Line(){

    }

    public Line(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
