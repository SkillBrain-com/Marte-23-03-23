package kateaManoila.JavaBasics3;

public class Cerc extends GeometricFigure{
    private double r;
    public double getArea(){
        return Math.PI*r*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
