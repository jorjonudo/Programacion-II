# Árbol Binario Genérico en Java 🌳

Este proyecto implementa un **árbol binario genérico** en Java, que permite realizar operaciones comunes como recorridos, filtrado funcional y visualización estructurada.

## 📁 Estructura del Proyecto

```
├── src/
│   ├── dominio/
│   │   ├── Arbol.java               # Implementación de la clase Arbol<E>
│   │   └── InterfazArbol.java       # Interfaz con los métodos del árbol
│   └── Principales/
│       ├── PruebaArbol.java         # Ejemplos de recorrido y filtrado
│       ├── Principal.java           # Representación visual del árbol (versión rotada)
│       └── PrincipalIndentado.java # Visualización del árbol con indentación por nivel
├── bin/                             # Carpeta para archivos compilados
├── lib/                             # Carpeta para bibliotecas externas (si las hubiera)
└── README.md                        # Este archivo
```

## ✅ Características

- Árbol binario genérico con soporte para cualquier tipo de dato.
- Recorridos:
  - InOrden
  - PreOrden
  - PostOrden
- Métodos funcionales:
  - `filtrar(Predicate<E>)`: devuelve una lista con los elementos que cumplen una condición.
  - `aplicar(Consumer<E>)`: aplica una acción a cada elemento del árbol.
- Detección de árbol vacío (`isVacio()`).
- Visualización en consola con indentación o rotación de 90°.

## 🚀 Cómo ejecutar

### 1. Compilar

Asegúrate de tener Java instalado (JDK 8 o superior).

```bash
javac -d bin src/dominio/*.java src/Principales/*.java
```

### 2. Ejecutar

Puedes ejecutar cualquiera de los programas de ejemplo:

```bash
java -cp bin Principales.PruebaArbol
java -cp bin Principales.Principal
java -cp bin Principales.PrincipalIndentado
```

## 🧪 Ejemplo de salida

### `PruebaArbol`

```
Recorrido InOrden: 1 3 4 5 7 8 9
Recorrido PreOrden: 5 3 1 4 8 7 9
Recorrido PostOrden: 1 4 3 7 9 8 5
Filtrados (>4): [5, 7, 8, 9]
Aplicar imprimir nodos: 1 3 4 5 7 8 9
```

### `PrincipalIndentado` (visualización)

```
        9
    8
        7
5
        4
    3
        1
```

## 👨‍💻 Autor

Jorge Delgado Castellanos
