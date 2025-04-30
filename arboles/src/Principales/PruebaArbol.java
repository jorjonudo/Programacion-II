package Principales;
import java.util.ArrayList;
import dominio.*;
public class PruebaArbol {
    public static void main(String[] args) {
        // Construir un árbol binario de enteros
        Arbol<Integer> arbol = new Arbol<>(5,
            new Arbol<>(3,
                new Arbol<>(1),
                new Arbol<>(4)
            ),
            new Arbol<>(8,
                new Arbol<>(7),
                new Arbol<>(9)
            )
        );

        System.out.println("Recorrido InOrden: " + arbol.recorrerInOrden());
        System.out.println("Recorrido PreOrden: " + arbol.recorrerPreOrden());
        System.out.println("Recorrido PostOrden: " + arbol.recorrerPostOrden());

        // Prueba de filtrar: números mayores que 4
        ArrayList<Integer> filtrados = arbol.filtrar(x -> x > 4, new ArrayList<>());
        System.out.println("Filtrados (>4): " + filtrados);

        // Aplicar una operación: imprimir cada nodo (ya se imprime en orden)
        System.out.print("Aplicar imprimir nodos: ");
        arbol.aplicar(x -> System.out.print(x + " "));
    }
}
