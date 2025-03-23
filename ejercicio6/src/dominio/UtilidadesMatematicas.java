package dominio;

import java.math.BigDecimal;
import java.util.List;
import java.util.Stack;

public class UtilidadesMatematicas {

    /*
     * Ejercicio 1: Suma recursiva de los elementos de una pila de BigDecimal
     * ---------------------------------------------------------------------------------
     * Se nos da el siguiente código que calcula la suma de los elementos de una pila
     * de BigDecimal de manera iterativa:
     * 
     * static public BigDecimal sumaIterativaElementosPila(Stack pila) {
     *     BigDecimal suma = BigDecimal.ZERO;
     *     while (!pila.empty()) {
     *         suma = suma.add((BigDecimal) pila.peek());
     *         pila.pop();
     *     }
     *     return suma;
     * }
     * 
     * Se pide implementar el método equivalente de manera **recursiva**, siguiendo 
     * la técnica de desarrollo dirigido por pruebas (TDD).
     */

    // Método recursivo para sumar los elementos de una pila de BigDecimal
    public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila) {
        if (pila.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal cima = pila.pop();
        BigDecimal suma = cima.add(sumaRecursivaElementosPila(pila));
        pila.push(cima); // Restaurar la pila después de la recursión
        return suma;
    }

    /*
     * Ejercicio 2: Cálculo de la media armónica con expresiones lambda
     * ---------------------------------------------------------------------------------
     * La media armónica de un conjunto de datos x1, x2, ..., xn viene definida por:
     * 
     *                 H = n / (∑(1 / x_k))   para k=1 hasta n
     * 
     * No está definida si:
     * a) Alguno de los elementos es 0
     * b) La suma de los inversos es 0
     * c) La lista está vacía
     * 
     * Se pide implementar el método utilizando expresiones lambda y programación funcional.
     */

    // Método para calcular la media armónica con validaciones
    public static double mediaArmonica(List<Double> datos) {
        if (datos.isEmpty()) throw new ArithmeticException("Lista vacía");

        double sumaInversos = datos.stream()
            .peek(x -> { if (x == 0) throw new ArithmeticException("Elemento cero en la lista"); })
            .mapToDouble(x -> 1.0 / x)
            .sum();

        if (sumaInversos == 0) throw new ArithmeticException("Suma de inversos es cero");

        return datos.size() / sumaInversos;
    }

    /*
     * Ejercicio 3: Análisis de Complejidad
     * ---------------------------------------------------------------------------------
     * Se nos da el siguiente pseudocódigo para calcular la media armónica:
     * 
     * function MediaArmónica(datos)
     *   suma ← 0
     *   for dato in datos do
     *       suma ← suma + 1/dato
     *   end for
     *   return datos.length / suma
     * end function
     * 
     * 🔹 Complejidad temporal:
     * - Se recorre la lista una sola vez en un bucle de tamaño `n`, realizando una operación constante.
     * - La suma y división son operaciones O(1).
     * - Por lo tanto, la complejidad del algoritmo es **O(n)**.
     */
}
