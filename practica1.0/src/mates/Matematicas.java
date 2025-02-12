package mates;

public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
    public static double generarNumeroPiIterativo(long pasos){
        long dentroDelCirculo = 0; //declaro la variable equivalente a los puntos dentro del circulo

        //creo un bulce indicando las cordenadas de los puntos totales
        for (long i = 0; i < pasos; i ++){
        double x = Math.random(); //creo una coordenada x random
        double y = Math.random(); //creo una coordenada y random

        if (x*x + y*y <= 1){  //indidco la formula de pitágoras, que pongo que es menor o igual a 1 porque son los que se situan dentro del círculo
            dentroDelCirculo++; //inicio el conteo de los puntos dentro del círculo
        }
    }
        return 4.0 * dentroDelCirculo/pasos; //retorno la fórmula que indica el número pi
    }
}