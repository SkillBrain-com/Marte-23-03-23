package FayedMustafa.JavaBasics3;

public class Circle extends GeometricFigure {

    private double r;

   public double getArea(){
       return Math.PI * r * r;
   }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
