# Validador de Doble Máster y Árboles Binarios

Este proyecto forma parte de una práctica de estructuras de datos. Abarca la implementación y análisis de árboles binarios, árboles rojo-negro, y una simulación de un sistema de validación de dobles másteres utilizando estructuras como `Set` y `Map`.

## 📚 Contenido

### Ejercicios de Árboles Binarios

- **Ejercicio 93:** Definición de árbol y árbol binario. Aplicaciones comunes.
- **Ejercicio 94:** Simulación de inserción en un árbol binario (valores: `2, 1, 3, 8, 5, 2`).
- **Ejercicio 95:** Reglas para el borrado de un nodo en un árbol binario.
- **Ejercicio 96:** Implementación en Java de una clase `BinaryTree` con inserción, búsqueda, recorrido y comparación estructural.
- **Ejercicio 103:** Implementación de un árbol n-ario (nodos con más de dos hijos).
- **Ejercicio 104:** Representación de HTML como estructura de árbol con JDOM.

### Árboles Rojo-Negro

- **Ejercicio 97:** Definición y propiedades de un árbol rojo-negro.
- **Ejercicio 98:** Inserción de nodos en un árbol rojo-negro con ejemplos.
- **Ejercicio 99:** Borrado de nodos rojos en un árbol rojo-negro.

### Estructuras Basadas en Árbol

- **Ejercicio 100:** Explicación de `Set` y su implementación con árbol binario.
- **Ejercicio 101:** Explicación de `Map` y su implementación con árbol binario.

---

## ✅ Proyecto: Validador de Doble Máster (Ejercicio 102)

Se ha desarrollado un sistema orientado a objetos que permite validar la consistencia de un doble máster, cumpliendo con las siguientes reglas:

1. **Cobertura del máster 1 y 2:** Todas sus asignaturas están presentes o convalidadas en el doble máster.
2. **Precisión del doble máster:** Las asignaturas del doble máster deben pertenecer a alguno de los dos másteres simples.
3. **Secuenciación correcta:** No puede haber asignaturas con semestre inconsistente entre el máster simple y el doble máster.

### Estructura del proyecto

- `Asignatura`: Clase que representa una asignatura con identificador, nombre, semestre y créditos.
- `Master`: Clase base que contiene un conjunto de asignaturas.
- `DobleMaster`: Hereda de `Master`. Gestiona convalidaciones y relaciones con dos másteres simples.

### Validación

Implementado un método `esValido()` que verifica que se cumplan las condiciones descritas anteriormente.

---

## 🛠️ Tecnologías

- Java 17+
- JUnit (para TDD)
- Git

---

## 🧪 Ejecución y pruebas

Para ejecutar los ejemplos o pruebas:

```
javac *.java
java Main  # si se ha creado una clase Main con ejemplos
```

Para lanzar tests (si se han definido con JUnit):

```
mvn test  # si usas Maven
```

---

## 📁 Organización 

```
src/
├── modelo/
│   ├── Asignatura.java
│   ├── Master.java
│   └── DobleMaster.java
├── estructuras/
│   └── BinaryTree.java
└── Main.java
```

---

## 👨‍🎓 Autor

Jorge Delgado Castellanos

Proyecto académico realizado como parte del curso de **Introducción a la Ingeniería Informática** - CEU San Pablo.
```

---

¿Quieres que también te genere el `.gitignore` y un `Main.java` de ejemplo para ejecutar todo desde consola?