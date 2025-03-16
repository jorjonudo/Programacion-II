# Proyecto: Matematicas y Principal en Java

Este proyecto contiene dos clases en Java: `Matematicas.java` y `Principal.java`.

## Descripción de las Clases

### 1. Matematicas.java
Esta clase proporciona varios métodos para realizar cálculos matemáticos básicos:

- **Suma iterativa** de los n primeros números naturales.
- **Suma recursiva** de los n primeros números naturales.
- **Cálculo recursivo del n-ésimo número de Fibonacci**.
- **Obtención del primer elemento** de una lista.
- **Obtención del enésimo elemento** de una lista.
- **Suma de todos los elementos de una matriz**.
- **Búsqueda de un número en un array de enteros**.

### 2. Principal.java
Esta clase contiene el método `main`, que ejecuta y prueba los métodos definidos en `Matematicas.java`.

## Requisitos
- Java 8 o superior

## Ejecución
Para ejecutar el programa:
1. Compila los archivos:
   ```sh
   javac Matematicas.java Principal.java
   ```
2. Ejecuta la clase principal:
   ```sh
   java Principal
   ```

## Ejemplo de Salida
```
Suma iterativa de 5 números naturales: 15
Suma recursiva de 5 números naturales: 15
Fibonacci de 5 es: 5
Suma de elementos de la matriz: 21.0
Número 3 encontrado: true
Primer elemento: Uno
Elemento en la posición 2: Tres
```

## Complejidad de los Algoritmos
| Método | Complejidad Temporal | Complejidad Espacial |
|--------|----------------------|----------------------|
| `sumaIterativa(n)` | O(n) | O(1) |
| `sumaRecursiva(n)` | O(n) | O(n) |
| `fibonacci(n)` | O(2^n) | O(n) |
| `sumaEltosMatriz(matriz)` | O(m×n) | O(1) |
| `buscar(e, array)` | O(n) | O(1) |

## Autor

Jorge Delgado 

Joaquin de Vicente Abad: https://github.com/JoaquinDeVA/Prog-II
