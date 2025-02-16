package aplicacion;

import dominio.mates;

/**
 * Ejercicio 4. Métodos iterativos, del cuaderno de ejercicios de clase.
 * Se entrega en un único repositorio git, con una sola clase de dominio, mates, y una clase principal que invoque a
 * todos los métodos estáticos de la clase para hacer una prueba.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("1. La suma 0+1+2+...+n es: " + mates.suma(10));
        System.out.println("2. El factorial de un número es: " + mates.factorial(5));
        System.out.println("3. La potencia n-ésima de un número es: " + mates.potencia(2, 3));
        System.out.println("4. La suma de los elementos de una lista es: " + mates.sumaLista(new int[]{1, 2, 3, 4}));
        System.out.println("5. La media aritmética es: " + mates.media(new int[]{1, 2, 3, 4}));
        System.out.println("6. La desviación típica es: " + mates.desviacion(new int[]{1, 2, 3, 4}));
        System.out.println("7. La suma de los primeros números pares hasta n es: " + mates.sumaPares(9));
        System.out.println("8. La suma de los elementos pares de una lista es: " + mates.sumaParesLista(new int[]{1, 2, 3, 4}));
        System.out.println("9. Lista con los números pares: " + mates.obtenerListaPar(new int[]{1, 2, 6, 11}));
        System.out.println("10. Lista de primeros números pares hasta n: " + mates.listaPares(9));
        System.out.println("11. Producto escalar de dos listas: " + mates.calcularProductoEscalar(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println("12. Elemento n-ésimo de Fibonacci: " + mates.fibonacci(10));
    }
}