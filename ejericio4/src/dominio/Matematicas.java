package dominio;

//Matematicas.java
import java.util.ArrayList;

public class Matematicas {
    // Algoritmo iterativo para la suma de los n primeros números naturales
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Algoritmo recursivo para la suma de los n primeros números naturales
    public static int sumaRecursiva(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumaRecursiva(n - 1);
    }

    // Método que devuelve el primer elemento de una lista
    public static String primero(ArrayList<String> lista) {
        return lista.get(0);
    }

    // Método que devuelve el enésimo elemento de una lista
    public static String nEsimo(ArrayList<String> lista, int n) {
        return lista.get(n);
    }

    // Método para calcular la suma de los elementos de una matriz
    public static double sumaEltosMatriz(double matriz[][]) {
        double suma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    // Método para buscar un número en un array de enteros
    public static boolean buscar(int e, int[] array) {
        for (int num : array) {
            if (num == e) {
                return true;
            }
        }
        return false;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
