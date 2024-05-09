import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_03 {
    public static void main(String[] args) {
        
        //Criação do Scanner para entrada de dados
        Scanner teclado = new Scanner(System.in);

        //Criação do ArrayList para receber os nomes
        ArrayList<String> nomes = new ArrayList<>();
        int quantNomes = 3;
        
        //Criação do loop para entrada dos nomes
        for(int i = 0; i < quantNomes; i++) {
            System.out.println("Digite o nome da pessoa " + (i+1));
            String nome = teclado.next();
            nomes.add(nome);
        }

        //Impressão dos valores armazenados
        for (String nome : nomes) {           
            System.out.println("O nome da pessoa é: " + nome );
        }

        teclado.close();
    }
}
