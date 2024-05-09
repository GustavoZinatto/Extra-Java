import java.util.Scanner;

public class Vetor_03 {
    public static void main(String[] args) {
        
        //Criação do teclado para a entrada de dados
        Scanner teclado = new Scanner(System.in);

        //Criação do vetor para os nomes dos Alunos
        String[] nomeAluno = new String[2];

        //Criação do vetor para as nota dos Alunos
        float[] notasAlunos = new float[2];

        //Criação do for para a entrada de dados
        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a nome do aluno " + (i+1));
            nomeAluno[i] = teclado.next();

            System.out.println("Digite a nome do aluno " + (nomeAluno[i]));
            notasAlunos[i] = teclado.nextFloat();
        }

        //Criação do for para impressão dos dados
        System.out.println("Lista de Alunos: ");
        for (int i = 0; i < nomeAluno.length; i++) {
            System.out.println("Nome: " + nomeAluno[i] + " | Nota: " + notasAlunos[i]);
        }
        
    }
}
