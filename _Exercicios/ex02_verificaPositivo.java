// Exercício: Crie um programa que leia um número inteiro e verifique se ele é positivo, negativo ou zero.

import java.util.Scanner;

public class ex02_verificaPositivo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i <= 3; i++) {
            System.out.println("Digite um número: ");
            float numero = teclado.nextFloat();

            if(numero > 0) {
                System.out.println("Você digitou um número positivo");
            } else if (numero == 0) {
                System.out.println("Você digitou um número igual a zero");
            } else {
                System.out.println("Você digitou um número negativo");
            }
        }
        
    teclado.close();
    }

}
