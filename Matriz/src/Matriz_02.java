import java.util.Scanner;

public class Matriz_02 {
    public static void main(String[] args) {
        // Declarando e inicializando uma matriz de inteiros 3x3
        //Primeiro Colchete representa as Linhas
        //Segundo Colchete representa as Colunas
        int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Escolha a linha do elemento que você deseja descobrir [de 1 a 3]: ");
        int linha = teclado.nextInt();
        System.out.println("Escolha a coluna do elemento que você deseja descobrir [de 1 a 3]: ");
        int coluna = teclado.nextInt();

        //Impressão do Elemento
        System.out.println("\nExibindo elemento...");
        System.out.println(matriz[linha-1][coluna-1]);

        //Matriz Completa
        System.out.println("\nExibindo a matriz completa...");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; i++) {
                System.out.println(matriz[i][j] + " ");
            }     
        }

        teclado.close();
    }
}
