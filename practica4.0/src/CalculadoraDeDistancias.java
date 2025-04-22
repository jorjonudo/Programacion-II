class CalculadoraDeDistancias {
    public static int DistMin(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Inicialización de la matriz
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // Coste de eliminar caracteres de str1
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // Coste de insertar caracteres en str1
        }

        // Llenado de la matriz con programación dinámica
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Sin coste si los caracteres son iguales
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], // Eliminación
                                            Math.min(dp[i][j - 1], // Inserción
                                                     dp[i - 1][j - 1])); // Sustitución
                }
            }
        }

        return dp[m][n]; // La distancia mínima está en la última celda
    }
}
