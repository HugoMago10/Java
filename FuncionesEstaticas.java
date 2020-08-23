package cursojava;

import java.util.Scanner;

/***
 *
 * @author kim
 */
public class CursoJava {
    static int num1, num2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoJava.leerValor( );
        CursoJava.imprimir ( );
        CursoJava.suma();
    }
    public static void leerValor ( ){
        Scanner in = new Scanner ( System.in );
        System.out.println ("Ingrese Num1: ");
        num1 = in.nextInt();
        System.out.println ("Ingrese Num2: ");
        num2 = in.nextInt();
    }
    public static void imprimir ( ){
        System.out.println ("Numero1 " + num1 );
        System.out.println ("Numero1 " + num2 );
    }
    public static void suma (){ System.out.println ("La suma es: " + (num1 + num2)); }
    
}