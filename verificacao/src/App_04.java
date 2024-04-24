
import java.util.Scanner;
import java.util.InputMismatchException;

public class App_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entradaValida = false;
        int numero = 0;

        do {
            try {
                System.out.print("Digite um número inteiro, entre 0 a 10: ");
                numero = scanner.nextInt();
                entradaValida = ValidaInt(numero);

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner
            }
        } while (!entradaValida);

        System.out.println("Obrigado por participar!");
        scanner.close();
    }

    //Criação do método para verificação 
    public static boolean ValidaInt(int numero){ 
        if (numero >= 0 && numero <= 10) { // || e/ou
            System.out.println("Você digitou um número válido!");
            System.out.println("Você digitou o número: " + numero);
            return true;
        } else {
            System.out.println("Você digitou um número inválido!");
            return false; //se o método for boolean ele precisa retornar um valor mesmo que seja um valor igual ao já definido, se não da erro
        } 
    }

}
