package Principales;

import dominio.*;

public class Principal {
    public static void main(String[] args) {
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

        System.out.println("\nRepresentación visual del árbol:");
        dibujarArbol(arbol, 0);
    }

    public static void dibujarArbol(InterfazArbol<Integer> a, int nivel) {
        if (!a.isVacio()) {
            dibujarArbol(a.der(), nivel + 1);
            for (int i = 0; i <= nivel; i++) {
                System.out.print("\t");
            }
            System.out.println(a.raiz());
            dibujarArbol(a.izq(), nivel + 1);
        }
    }
}
