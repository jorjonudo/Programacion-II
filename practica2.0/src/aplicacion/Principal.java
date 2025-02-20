package aplicacion; 
import mates.Matematicas; 

public class Principal {
    public static void main(String[] args) {
        // Verifica si el usuario proporcionó un argumento (el número de pasos)
        if (args.length == 0) {
            System.out.println("Error: Debes proporcionar el número de pasos como argumento.");
            return; // Termina la ejecución del programa
        }

        // Convierte el primer argumento de la línea de comandos a un número entero
        int pasos = Integer.parseInt(args[0]);

        // Llama a la función recursiva para calcular una aproximación de PI y muestra el resultado
        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(pasos, 0));
    }
}
