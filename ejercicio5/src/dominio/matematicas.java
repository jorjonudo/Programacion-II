package dominio;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class matematicas {
    public static void main(String[] args) {
        // 1. Stream de números usando of
        IntStream.of(1, 2, 3, 4, 5).forEach(n -> System.out.println("of: " + n));
        
        // 2. Stream de números usando range
        IntStream.range(1, 6).forEach(n -> System.out.println("range: " + n));
        
        // 3. Stream de números usando iterate
        IntStream.iterate(1, n -> n + 2).limit(5).forEach(n -> System.out.println("iterate: " + n));
        
        // 4. Stream de números aleatorios usando doubles
        new Random().doubles(5).forEach(n -> System.out.println("random: " + n));
    }


    //Ejercicio 15. Resuleva los apartados del 1 al 12 del ejercicio 2, ambos inclusive, mediante expresiones lambda y streams

    

        // Calcula la suma de los números desde 0 hasta n
    public static int suma(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

        // Calcula el factorial de un número n
    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
        // Calcula la potencia de num elevado a n
    public static int potencia(int num, int n) {
        return IntStream.range(0, n).reduce(1, (a, b) -> a * num);
    }
        
    public static int sumaLista(int[] lista) {
        return IntStream.of(lista).sum();
    }

    public static int media(int[] lista) {
        return (int) IntStream.of(lista).average().orElse(0);
    }

    public static double desviacion(int[] lista) {
        double media = media(lista);
        return Math.sqrt(IntStream.of(lista).mapToDouble(num -> Math.pow(num - media, 2)).average().orElse(0));
    }
    
    public static int sumaPares(int n) {
        return IntStream.range(2, n).filter(i -> i % 2 == 0).sum();
    }

    public static int sumaParesLista(int[] lista) {
        return IntStream.of(lista).filter(num -> num % 2 == 0).sum();
    }

    public static List<Integer> obtenerListaPar(int[] numeros) {
        List<Integer> listaPares = new ArrayList<>();
        IntStream.of(numeros).filter(num -> num % 2 == 0).forEach(listaPares::add);
        return listaPares;
    }

    public static List<Integer> listaPares(int n) {
        List<Integer> lista = new ArrayList<>();
        IntStream.iterate(n, i -> i - 2).limit(n / 2).forEach(lista::add);
        return lista;
    }

    public static int calcularProductoEscalar(int[] lista1, int[] lista2) {
        return IntStream.range(0, lista1.length).map(i -> lista1[i] * lista2[i]).sum();
    }

}   