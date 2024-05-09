public class Matriz_01 {
    public static void main(String[] args) {
        // Declarando e inicializando uma matriz de inteiros 3x3
        //Primeiro Colchete representa as Linhas
        //Segundo Colchete representa as Colunas
        int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Acessando elementos da matriz e imprimindo-os
        System.out.println("Exibindo Matriz completa");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Adiciona uma quebra de linha após cada linha da matriz
        }

        //Selecionando os elementos da matriz para imprimi-los
        System.out.println("Selecionando o elemento armzenado na linha 3, coluna 2...");
        System.out.println(matriz[2][1]); //elemento armazenado na linha 3, coluna 2
    }
}
