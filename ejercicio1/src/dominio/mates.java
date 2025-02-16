package dominio;

import java.util.ArrayList;
import java.util.List;

public class mates {

    public static int suma(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int potencia(int num, int n) {
        int potencia = 1;
        for (int i = 1; i <= n; i++) {
            potencia *= num;
        }
        return potencia;
    }

    public static int sumaLista(int[] lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public static int media(int[] lista) {
        return sumaLista(lista) / lista.length;
    }

    public static double desviacion(int[] lista) {
        double media = media(lista);
        double sum = 0;
        for (int num : lista) {
            sum += Math.pow(num - media, 2);
        }
        return Math.sqrt(sum / lista.length);
    }

    public static int sumaPares(int n) {
        int suma = 0;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static int sumaParesLista(int[] lista) {
        int suma = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        return suma;
    }

    public static List<Integer> obtenerListaPar(int[] numeros) {
        List<Integer> listaPares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }
        return listaPares;
    }

    public static List<Integer> listaPares(int n) {
        List<Integer> lista = new ArrayList<>();
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                lista.add(i);
            }
        }
        return lista;
    }

    public static int calcularProductoEscalar(int[] lista1, int[] lista2) {
        int productoEscalar = 0;
        for (int i = 0; i < lista1.length; i++) {
            productoEscalar += lista1[i] * lista2[i];
        }
        return productoEscalar;
    }

    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}