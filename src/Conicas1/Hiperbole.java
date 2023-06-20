package Conicas1;

public class Hiperbole{

    //Atributos
    //Definimos variables generales
    float x, y, h, k, a, b, ecua_canon;

    //Constructores

    public Hiperbole(float x, float y, float h, float k, float a, float b, float ecua_canon) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.k = k;
        this.a = a;
        this.b = b;
        this.ecua_canon = ecua_canon;
    }

    //Métodos
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getEcua_canon() {
        return ecua_canon;
    }

    public void setEcua_canon(float ecua_canon) {
        this.ecua_canon = ecua_canon;
    }

    //Metodos con formulas

    /*Hallar el centro, los vertices, focos y asintotas de la hiperbola con lo siguientes elementos:
    vertice, a, b, c*/

    public double hallar_C(){
        float a = 3;
        float b = 2;
        //c2 = a2 + b2
        return Math.sqrt((a*a)+(b*b));
    }

    /*Formula para hallar los vertices de la hiperbole*/
    public void hallar_vertices(){
        //V1 = (x+a), y;
        //V2 = (x-a), y;

        int v1 = (int) (x-a);
        System.out.println("El vertice 1 es: ("+v1+", -1)");

        int v2 = (int) (x+a);
        System.out.println("El vertice 2 es: ("+v2+", -1)");
    }
}