//Estrutura básica do Try-Catch

import java.util.Scanner;

public class App_01 {
    public static void main(String[] args) throws Exception {

        int numero = 0;
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Digite um número de 0 a 10");
            numero = teclado.nextInt();

            if (numero >= 0 && numero <= 10) {
                System.out.println("Você digitou um número válido");
            } else {
                System.out.println("Você digitou um número fora do intevalo válido");
            }

        } catch (NumberFormatException e) {
            System.out.println("Você digitou um número inválido");
        }

        System.out.println("Você digitou o número: " + numero);
        teclado.close();

    }
}
