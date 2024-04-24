import java.util.Scanner;

public class App_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Digite um número de 0 a 10: ");
                numero = Integer.parseInt(scanner.nextLine()); //converte a resposta para numero inteiro

                if (numero < 0 || numero > 10) {
                    System.out.println("Número fora do intervalo permitido. Tente novamente.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        } while (!entradaValida);

        System.out.println("Você digitou o número: " + numero);
        scanner.close();
    }
}
