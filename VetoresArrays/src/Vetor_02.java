import java.util.Scanner;

public class Vetor_02 {
    public static void main(String[] args) {
        
        //Criando o vetor
        String[] comida = new String[4];

        //Criando o Scanner
        Scanner teclado = new Scanner(System.in);

        //Criação do for para entrada de Dados
        for(int i = 0; i < 4; i++) {
            System.out.println("Digite sua comida número " + (i+1));
            comida[i] = teclado.nextLine();
        }

        System.out.println("A ordem de suas comidas favoritas é: ");
        
        //Criação do foreach para saída de Dados
        for (String elemento : comida) {
            System.out.println(elemento);
        }

        System.out.println("Obrigado pela visita!");

        teclado.close();
    }
}