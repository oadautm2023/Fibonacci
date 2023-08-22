/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author SPEEDMIND
 */
import java.util.Scanner;
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int _tam;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la serie");
        _tam=sc.nextInt();
        Metodos m=new Metodos(_tam);
        int _a[]=new int[m.getTam()];
        _a=m.serie();
        m.imprimir(_a);
        System.out.println("la suma de los factores de la serie es :"+m.sumar(_a));
    }
    
}
