import Conicas1.*;
import java.util.Scanner;

    public class Menu {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            Parabola figura1 = new Parabola(7.3, 6.9, 2.7,2,3.1);
            Parabola figura2 = new Parabola(2.33, 3.33, 5.55, 6.66,2.1);

            Hiperbole figura3 = new Hiperbole(2.63f, 5.78f,4.2f,1.7f,2,3,8);
            Hiperbole figura4 = new Hiperbole(6.33f, 12.96f,1.2f,3.7f,3,2,2);

            Circunferencia figura5 = new Circunferencia(6.37f, 9.99f,3,2,4,1.5f);
            Circunferencia figura6 = new Circunferencia(1.23f, 4.635f,1.5F,4,2,2.5f);

            ELIPSEE figura7 = new ELIPSEE(6.453f, 12.44f,5.3f,2.4f,1.3f,2.6f);
            ELIPSEE figura8 = new ELIPSEE(9.99f, 6.66f,3.33f,4.44f,1.11f,2.22f);

            System.out.println("\n\t------------FIGURAS 3D CON PACKAGE EQUIPO 1------------");

            System.out.println("\n----- 1. PARABOLA -----" );
            System.out.println("----- 2. HIPERBOLE -----");
            System.out.println("----- 3. CIRCUNFERENCIA -----");
            System.out.println("-----4. ELIPSE -----");

            System.out.println("\nPara continuar, seleccione el numero de la figura a usar: ");
            String opt = entrada.next();

            switch (opt) {
                case "1":
                    System.out.println("\n----- Ha seleccionado Parabola-----");
                    System.out.println(" Para primera instancia: ");
                    figura1.imprimirDatos();
                    System.out.println(" Para segunda instancia: ");
                    figura2.imprimirDatos();
                    break;
                case "2":
                    System.out.println("\n----- Ha seleccionado Hiperbole-----");
                    System.out.println(" Para primera instancia: ");
                    figura3.hallar_vertices();
                    System.out.println(" Para segunda instancia: ");
                    figura4.hallar_vertices();
                    break;
                case "3":
                    System.out.println("\n----- Ha seleccionado Circunferencia -----");
                    System.out.println(" Para primera instancia: ");
                    figura5.imprimir();
                    System.out.println(" Para segunda instancia: ");
                    figura6.imprimir();
                    break;
                case "4":
                    System.out.println("\n----- Ha seleccionado Elipse -----");
                    System.out.println(" Para primera instancia: ");
                    figura7.imprimir_Eli();
                    System.out.println(" Para segunda instancia: ");
                    figura8.imprimir_Eli();
                    break;
                default:
                    System.out.println("ERROR! Esta opcion no se encuentra en el sistema!");
                    break;
            }
        }
    }

