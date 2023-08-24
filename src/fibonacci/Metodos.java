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
public class Metodos {
    
    private final int tam;
    
    public Metodos(int tam) {
        this.tam = tam;
    }
    public int getTam() {
        return tam;
    }
    // la funcion recursiva de Fibbonacci
    public int fibonaci(int num) {
        int fib = 0;
        if (num > 1) {
            fib = fibonaci(num - 1) + fibonaci(num - 2);
        } else {
            fib = fib + 1;
        }
        return fib;
    }
    //metodo ´para calcular el factorial de un numero
    public int factorial(int num) {
        int fact = 0;
        if (num > 0) {
            fact = num * factorial(num - 1);
        } else {
            fact = 1;
        }
        return fact;
    }
    public int[] serie() {
        int a[] = new int[getTam()];
        if (getTam()==1) {
            a[0]=0;
        } else {
            if (getTam()==2) {
                a[0]=0;
                a[1]=1;
            } else {
                if (getTam()>2) {
                    a[0]=0;
                    a[1]=1;
                    for (int i = 2; i < getTam(); i++) {
                        a[i]=a[i-1]+a[i-2];
                    }
                    
                }
            }
        }
        return a;

    }
    public int sumar(int a[]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
    return sum;
    }
    public void imprimir(int a[]){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
    }
}
