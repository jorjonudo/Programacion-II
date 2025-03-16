package aplicacion;

import java.util.ArrayList;
import dominio.Matematicas;
public class Principal {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Suma iterativa de " + n + " números naturales: " + Matematicas.sumaIterativa(n));
        System.out.println("Suma recursiva de " + n + " números naturales: " + Matematicas.sumaRecursiva(n));

        System.out.println("Fibonacci de " + n + " es: " + Matematicas.fibonacci(n));
        
        double[][] matriz = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        System.out.println("Suma de elementos de la matriz: " + Matematicas.sumaEltosMatriz(matriz));

        int[] array = {1, 2, 3, 4, 5};
        int buscarNumero = 3;
        System.out.println("Número " + buscarNumero + " encontrado: " + Matematicas.buscar(buscarNumero, array));

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        System.out.println("Primer elemento: " + Matematicas.primero(lista));
        System.out.println("Elemento en la posición 2: " + Matematicas.nEsimo(lista, 2));
    }
}
