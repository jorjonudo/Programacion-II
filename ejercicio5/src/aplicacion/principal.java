package aplicacion;
import dominio.matematicas;

public class principal {
    public static void main(String[] args) {
        int n = 5;
        int[] lista = {1, 2, 3, 4, 5};
        int[] lista1 = {1, 2, 3};
        int[] lista2 = {4, 5, 6};

        System.out.println("Suma de 0 a " + n + ": " + matematicas.suma(n));
        System.out.println("Factorial de " + n + ": " + matematicas.factorial(n));
        System.out.println("Potencia de 2^" + n + ": " + matematicas.potencia(2, n));
        System.out.println("Suma de la lista: " + matematicas.sumaLista(lista));
        System.out.println("Media de la lista: " + matematicas.media(lista));
        System.out.println("Desviación estándar de la lista: " + matematicas.desviacion(lista));
        System.out.println("Suma de pares hasta " + n + ": " + matematicas.sumaPares(n));
        System.out.println("Suma de pares en la lista: " + matematicas.sumaParesLista(lista));
        System.out.println("Lista de pares en la lista: " + matematicas.obtenerListaPar(lista));
        System.out.println("Lista de pares descendente hasta " + n + ": " + matematicas.listaPares(n));
        System.out.println("Producto escalar de listas: " + matematicas.calcularProductoEscalar(lista1, lista2));
    }
}
