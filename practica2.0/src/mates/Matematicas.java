package mates;

public class Matematicas {

    public static double generarNumeroPiRecursivo(long pasos, long dentroDelCirculo) { //Creo un if para comprobar que si los pasos son iguales que 0 me retorne la ecuacion directa
        if (pasos == 0) { 
            return 4.0 * dentroDelCirculo / 1.0;  // Se divide entre 1 en vez de 0 para que no cause error
        }
        
        double x = Math.random(); //creo una coordenada x random
        double y = Math.random(); //creo una coordenada y random

        if (x * x + y * y <= 1) {  //y en caso que sea mayor a 0 aplicamos pitágoras
            dentroDelCirculo++; 
        }

        return generarNumeroPiRecursivo(pasos - 1, dentroDelCirculo);
    }

    // Método auxiliar para evitar que tenga que pasar "dentroDelCirculo"
    public static double generarNumeroPi(long pasos) {
        return generarNumeroPiRecursivo(pasos, 0);
    }
}
