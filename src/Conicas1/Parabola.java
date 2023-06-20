package Conicas1;

public class Parabola {
    private double k;
    private double h;
    private double a;
    private double x;
    private double y;
    private double resultado;

    public Parabola(double k, double h, double a, double x, double y) {
        this.k = k;
        this.h = h;
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double parabola(double h, double k, double a, double b){

        return (this.k=k);
    }
    private double calculo_eje_horizontal(){
        this.h = (((y*y) - (2*y*k) + (k*k) - (4*a*x)) / (-4*a));
        return h;
    }

    public boolean imprimirDatos(){
        System.out.println("Eje Horizontal: "+this.h);
        return false;
    }
}
