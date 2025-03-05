package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        // Verifica que el usuario haya proporcionado un argumento
        if (args.length == 0) {
            System.out.println("proporciona el número de pasos como argumento.");
            return;
        }
        
        // Convierte el argumento proporcionado a un número entero largo (long)
        long pasos = Long.parseLong(args[0]);
        
        // Llama al método que calcula Pi usando el método de Montecarlo con streams
        System.out.println("El número PI es " + Matematicas.generarNumeroPiLambda(pasos));
    }
}