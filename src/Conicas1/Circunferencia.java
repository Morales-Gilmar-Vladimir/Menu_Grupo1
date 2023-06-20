package Conicas1;

public class Circunferencia {

    float radio;
    float diametro;

    float longitud;
    float area;
    float a_semicircunferencia;
    float circunferencia;

    float pi = 3.1416f;


    // creamos el constructor
    public Circunferencia(float circunferencia, float radio, float diametro, float longitud, float area, float a_semicircunferencia) {
        this.radio = radio;
        this.diametro = diametro;
        this.longitud = longitud;
        this.area = area;
        this.a_semicircunferencia = a_semicircunferencia;
    }

    // creamos los getter y setter
    public float getCircunferencia() {
        return radio;
    }

    public void setCircunferencia(float circunferencia) {
        this.radio = circunferencia;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getA_semicircunferencia() {
        return a_semicircunferencia;
    }

    public void setCentro(float a_semicircunferencia) {
        this.a_semicircunferencia = a_semicircunferencia;
    }

    public void radio() {

        radio = this.circunferencia / (2 * this.pi);
    }

    public void diametro() {
        diametro = 2 * this.radio;
    }

    public void longitud() {
        longitud = this.diametro * this.pi;
    }

    public void area() {
        area = (this.pi * this.pi) * this.radio;
    }

    public void a_semicircunferencia() {
        a_semicircunferencia = (this.pi * (this.radio * this.radio)) / 2;
    }

    public void imprimir() {
        System.out.println("Radio: "+this.radio);
        System.out.println("A. Semicircunferencia: "+this.a_semicircunferencia);
        System.out.println("Diametro: "+this.diametro);
        System.out.println("Longitud: "+this.longitud);
        System.out.println("Area: "+this.area);
    }
}
