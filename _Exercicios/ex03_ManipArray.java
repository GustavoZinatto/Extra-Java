// Exercício: Escreva um programa Java que receba um array de inteiros e um número inteiro n, 
// e então crie e retorne um novo array contendo os n primeiros elementos do array original.

import java.util.Scanner;

public class ex03_ManipArray {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int[] arrayList = new int[9];

        for(int i = 0; i < arrayList.length ; i++) {
            System.out.println("Digite um número da sequência: ");
            arrayList[i] = entrada.nextInt(); 
        }

        System.out.println("Digite até que número deseja exibir a Lista: ");
        int n = entrada.nextInt();

        int[] novoArray = new int[n];
        for(int i = 0; i < n; i++) {
            novoArray[i] = arrayList[i];
        }
        System.out.println("Exibindo sequência até a posição " + n);
        for (int exibir : novoArray) {
            System.out.println(exibir);
        }

        entrada.close();
    }
}
