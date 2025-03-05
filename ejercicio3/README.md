# Proyecto: Operaciones Matemáticas con Streams en Java

## Descripción

Este proyecto implementa diversas operaciones matemáticas utilizando expresiones lambda y streams en Java. Se organiza en dos paquetes:

- **`dominio`**: Contiene la clase `matematicas` con métodos para cálculos matemáticos como suma, factorial, potencia, media, desviación estándar, entre otros.
- **`aplicacion`**: Contiene la clase `principal` que prueba las funciones implementadas en `matematicas`.

## Requisitos

- Java 8 o superior

## Estructura del Proyecto

```
📦 proyecto-matematicas
 ┣ 📂 src
 ┃ ┣ 📂 dominio
 ┃ ┃ ┗ 📜 matematicas.java
 ┃ ┣ 📂 aplicacion
 ┃ ┃ ┗ 📜 principal.java
 ┗ 📜 README.md
```

## Instalación y Ejecución

1. Clonar el repositorio:
   ```sh
   git clone https://github.com/usuario/proyecto-matematicas.git
   ```
2. Compilar las clases:
   ```sh
   javac -d bin src/dominio/matematicas.java src/aplicacion/principal.java
   ```
3. Ejecutar el programa:
   ```sh
   java -cp bin aplicacion.principal
   ```

## Funcionalidades

La clase `matematicas` implementa los siguientes métodos:

- `suma(int n)`: Suma los números de 0 a `n`.
- `factorial(int n)`: Calcula el factorial de `n`.
- `potencia(int num, int n)`: Calcula `num^n`.
- `sumaLista(int[] lista)`: Suma los elementos de una lista.
- `media(int[] lista)`: Calcula la media de una lista.
- `desviacion(int[] lista)`: Calcula la desviación estándar.
- `sumaPares(int n)`: Suma los números pares menores que `n`.
- `sumaParesLista(int[] lista)`: Suma los números pares de una lista.
- `obtenerListaPar(int[] lista)`: Devuelve una lista con los números pares.
- `listaPares(int n)`: Genera una lista de pares descendentes desde `n`.
- `calcularProductoEscalar(int[] lista1, int[] lista2)`: Calcula el producto escalar de dos listas.

## Licencia

Este proyecto está bajo la licencia Apache.

## Contribuyentes

Jorge Delgado
Miguel Gonzalo

