# Práctica 3 - Aproximación de Pi con Montecarlo y Streams

## 📌 Descripción
Este proyecto implementa un método para aproximar el número Pi utilizando el método de Montecarlo. Se ha desarrollado utilizando **Java Streams y Expresiones Lambda**, lo que permite un código más conciso y eficiente.

El programa genera puntos aleatorios en un cuadrado de lado 1 y cuenta cuántos caen dentro de un círculo de radio 1. A partir de esta proporción, se aproxima el valor de Pi.

## 📂 Estructura del Proyecto
```
│── src/
│   ├── mates/
│   │   ├── Matematicas.java  # Implementación del método de Montecarlo con Streams
│   ├── aplicacion/
│   │   ├── Principal.java    # Clase principal que ejecuta el cálculo de Pi
│── bin/                      # Archivos compilados
│── lib/                      # Librerías externas (si aplican)
│── Makefile                  # Archivo para compilar y ejecutar
│── README.md                 # Documento de información
```

## 🚀 Uso
### 1️⃣ Compilar el proyecto
Ejecuta el siguiente comando:
```sh
make compilar
```
Esto generará los archivos compilados en el directorio `bin/`.

### 2️⃣ Ejecutar el programa
Para ejecutar el programa y calcular Pi con un número específico de iteraciones, usa:
```sh
make ejecutar ARGS="1000000"
```
📌 **Nota:** Cambia `1000000` por el número de puntos que quieras generar.

También puedes ejecutarlo manualmente:
```sh
java -cp bin aplicacion.Principal 1000000
```

### 3️⃣ Generar un archivo JAR (Opcional)
Si deseas crear un ejecutable `.jar`, usa:
```sh
make jar
```
Y para ejecutarlo:
```sh
make runjar
```

### 4️⃣ Generar documentación Javadoc
Si deseas generar la documentación Javadoc:
```sh
make javadoc
```
Esto creará la documentación en la carpeta `html/`.

## 📌 Ejemplo de Salida
Ejecutando el programa con 1,000,000 iteraciones:
```
El número PI es 3.141592
```

## 🛠 Tecnologías utilizadas
- **Java 8+**
- **Streams y Expresiones Lambda**
- **Makefile** para compilación y ejecución

## ✨ Autor
Jorge Delgado

Miguel Gonzalo


¡Disfruta programando! 🚀
