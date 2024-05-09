import java.util.ArrayList;
import java.util.Scanner;

//Com base no exemplo anterior, criar um sistema que recebe nome e notas e exibe no final

public class Arrays_05
 {
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

        //Verificação da Maior nota
        float maiorNota = 0;
        int nomeMaiorNota = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > maiorNota) {
                maiorNota = notas.get(i);
                nomeMaiorNota = i;
            }
        }

        //Impressão dos valores armazenados
        for (int i = 0; i < nomes.size(); i++) {           
            System.out.println("Aluno: " + nomes.get(i) + " e sua nota é: " + notas.get(i));
        }
        System.out.println("O aluno com a maior nota é: " + nomes.get(nomeMaiorNota) + ", sua nota foi: " + notas.get(nomeMaiorNota));

        teclado.close();
    }
}
