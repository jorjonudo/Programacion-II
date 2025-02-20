# π-Calculator (Monte Carlo Method)

Este es un pequeño proyecto en Java que estima el valor de **π (pi)** utilizando el **método de Montecarlo**. Se implementa tanto una versión iterativa como una recursiva del cálculo.

## 🚀 Características
- Cálculo de π usando números aleatorios.
- Implementación **recursiva**.
- Uso de argumentos desde la línea de comandos.

## 📂 Estructura del Proyecto
```
├── mates/
│   ├── Matematicas.java  # Contiene las funciones iterativa y recursiva para calcular π
│
├── aplicacion/
│   ├── Principal.java    # Programa principal que ejecuta la estimación de π
│
└── README.md  # Este archivo de documentación
```

## 🛠️ Instalación y Uso
### 1️⃣ **Compilar el proyecto**
Ejecuta el siguiente comando para compilar los archivos Java:
```sh
javac -d out mates/Matematicas.java aplicacion/Principal.java
```

### 2️⃣ **Ejecutar el programa**
Para calcular π, ejecuta:
```sh
java -jar pi.jar 1000000
```
*(Reemplaza `1000000` con el número de iteraciones que desees)*

### 🔍 **Ejemplo de salida:**
```
El número PI es 3.141592
```

## 📝 Explicación del Método de Montecarlo
El cálculo de π se basa en la relación entre el área de un círculo y un cuadrado circunscrito:
1. Se generan puntos aleatorios dentro de un cuadrado de lado 1.
2. Se cuenta cuántos puntos caen dentro del círculo de radio 1.
3. Se usa la fórmula:  
   \[ \pi \approx 4 \times \frac{puntos \ dentro \ del \ círculo}{puntos \ totales} \]

## 📜 Licencia
Este proyecto es de código abierto y puedes usarlo libremente.

## 🧑‍💻 Autor
Miguel Gonazalo 
Jorge Delgado
