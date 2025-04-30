package Principales;
import dominio.*;
public class PrincipalIdentado {

    // Método principal donde se construye un árbol binario de enteros
    public static void main(String[] args) {
        // Se construye un árbol binario con valores específicos
        Arbol<Integer> arbol = new Arbol<>(5,
            new Arbol<>(3,
                new Arbol<>(1),  // Hijo izquierdo de 3
                new Arbol<>(4)   // Hijo derecho de 3
            ),
            new Arbol<>(8,
                new Arbol<>(7),  // Hijo izquierdo de 8
                new Arbol<>(9)   // Hijo derecho de 8
            )
        );

        // Se imprime el árbol en consola con indentación por niveles
        System.out.println("\nRepresentación visual del árbol (con indentación por nivel):");
        dibujarArbol(arbol, 0);
    }

    /**
     * Método recursivo que imprime un árbol binario rotado 90 grados a la izquierda.
     * El subárbol derecho se dibuja arriba, el izquierdo abajo, y el nodo raíz con indentación.
     * 
     * @param a      El árbol que se va a imprimir (de tipo InterfazArbol<Integer>).
     * @param nivel  El nivel de profundidad actual en el árbol (usado para calcular indentación).
     */
    public static void dibujarArbol(InterfazArbol<Integer> a, int nivel) {
        // Verifica si el árbol no está vacío
        if (!a.isVacio()) {
            // Llama recursivamente para imprimir primero el subárbol derecho
            dibujarArbol(a.der(), nivel + 1); // Dibujar derecha

            // Imprime tabuladores correspondientes al nivel para alinear el nodo visualmente
            for (int i = 0; i <= nivel; i++) {
                System.out.print("\t");
            }

            // Imprime el valor del nodo actual con su indentación
            System.out.println(a.raiz());

            // Llama recursivamente para imprimir el subárbol izquierdo
            dibujarArbol(a.izq(), nivel + 1); // Dibujar izquierda
        }
    }
}
