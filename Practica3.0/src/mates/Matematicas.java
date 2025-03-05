package mates;

import java.util.stream.LongStream;

public class Matematicas {
    /**
     * Genera una aproximación al número Pi mediante el método de
     * Montecarlo usando expresiones lambda y streams. El parámetro `pasos`
     * indica el número de puntos generados.
     */
    public static double generarNumeroPiLambda(long pasos) {
        // Cuenta cuántos puntos caen dentro del círculo unitario
        long dentroDelCirculo = LongStream.range(0, pasos)
            // Genera pares de coordenadas aleatorias (x, y)
            .mapToObj(x -> new double[]{Math.random(), Math.random()})
            // Filtra los puntos que están dentro del círculo (x^2 + y^2 <= 1)
            .filter(coord -> coord[0] * coord[0] + coord[1] * coord[1] <= 1)
            // Cuenta la cantidad de puntos dentro del círculo
            .count();
        
        // Calcula la aproximación de Pi usando la fórmula 4 * (dentro / total)
        return 4.0 * dentroDelCirculo / pasos;
    }
}
