import java.util.ArrayList;
import java.util.Scanner;

//Com base no exemplo anterior, criar um sistema que recebe nome e notas e exibe no final

public class Arrays_04 {
    public static void main(String[] args) {
        
        //Criação do Scanner para entrada de dados
        Scanner teclado = new Scanner(System.in);

        //Criação do ArrayList para receber os nomes
        ArrayList<String> nomes = new ArrayList<>();
        //Criação do ArrayLista para receber as notas
        ArrayList<Float> notas = new ArrayList<>();
        
        int quantNomes = 3;
        
        //Criação do loop para entrada dos nomes
        for(int i = 0; i < quantNomes; i++) {

            System.out.println("Digite o nome do aluno " + (i+1));
            String nome = teclado.next();
            nomes.add(nome);

            System.out.println("Digite a nota do aluno: ");
            Float nota = teclado.nextFloat();
            notas.add(nota);
        }

        //Impressão dos valores armazenados
        for (int i = 0; i < nomes.size(); i++) {           
            System.out.println("O nome da pessoa é: " + nomes.get(i) + " e sua nota é: " + notas.get(i));
        }

        teclado.close();
    }
}
