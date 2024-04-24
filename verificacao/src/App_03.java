
import java.util.Scanner;
import java.util.InputMismatchException;

public class App_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entradaValida = false;
        int numero = 0;

        do {
            try {
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        } while (!entradaValida);

        System.out.println("Você digitou o número: " + numero);
        scanner.close();
    }
}
