:

📌 README.md
md
Copiar
Editar
# 📊 Cálculo de Suma Recursiva y Media Armónica en Java

Este proyecto implementa dos algoritmos en Java:

1. **Suma recursiva de una pila de `BigDecimal`**  
2. **Cálculo de la media armónica de una lista de números**  
3. **Análisis de complejidad del algoritmo de media armónica**  

---

## 📝 Descripción  

### 1️⃣ **Suma Recursiva de una Pila**  
Se proporciona una pila de números en `BigDecimal`, y se implementa una función recursiva para calcular su suma sin modificar la estructura original.  

📌 **Método Implementado:**  
```java
public static BigDecimal sumaRecursivaElementosPila(Stack<BigDecimal> pila)
2️⃣ Media Armónica con Expresiones Lambda
Se calcula la media armónica de una lista de números utilizando programación funcional en Java.

📌 Método Implementado:

java
Copiar
Editar
public static double mediaArmonica(List<Double> datos)
⚠ Validaciones:

La lista no puede estar vacía.

No puede contener elementos 0.

La suma de los inversos no puede ser 0.

3️⃣ Análisis de Complejidad
El algoritmo de media armónica tiene complejidad O(n), ya que se recorre la lista una única vez con operaciones O(1).

🚀 Estructura del Proyecto
bash
Copiar
Editar
📂 src
 ├── 📂 dominio
 │   ├── UtilidadesMatematicas.java  # Implementaciones de los métodos
 ├── 📂 principal
 │   ├── Main.java                   # Clase principal con pruebas
 ├── README.md                        # Documentación
⚙ Instalación y Ejecución
Clonar el repositorio:

sh
Copiar
Editar
git clone https://github.com/tu-usuario/nombre-repo.git
cd nombre-repo
Compilar y ejecutar:

sh
Copiar
Editar
javac -d bin src/dominio/*.java src/principal/*.java
java -cp bin principal.Main
🧪 Ejemplo de Salida Esperada
r
Copiar
Editar
➡ Prueba de suma recursiva de la pila
Suma recursiva de la pila: 7.0

➡ Prueba de cálculo de la media armónica
Media armónica: 3.2
🛠 Tecnologías Usadas
Java 11+

Programación funcional con Streams

Git & GitHub

📝 Autores
Jorge Delgado

Joquin De Vicente Abad: https://github.com/JoaquinDeVA

📌 Si te ha sido útil, dale ⭐ en GitHub! 🚀

yaml
Copiar
Editar

---

