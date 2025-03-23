package aplicacion;

import dominio.UtilidadesMatematicas;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        // 1️⃣ Prueba de la suma recursiva de una pila de BigDecimal
        Stack<BigDecimal> pila = new Stack<>();
        pila.push(new BigDecimal("1.5"));
        pila.push(new BigDecimal("2.5"));
        pila.push(new BigDecimal("3.0"));

        BigDecimal sumaRecursiva = UtilidadesMatematicas.sumaRecursivaElementosPila(pila);
        System.out.println("Suma recursiva de la pila: " + sumaRecursiva);

        // 2️⃣ Prueba de la media armónica
        List<Double> datos = Arrays.asList(4.0, 2.0, 8.0);
        try {
            double resultado = UtilidadesMatematicas.mediaArmonica(datos);
            System.out.println("Media armónica: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
