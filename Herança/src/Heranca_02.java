//Criação de um sistema básico com alguns elementos de Aluno e Professor
public class Heranca_02 {
    public static void main(String[] args) {

        //instanciação com as Classes Filhas
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        
        //Declaração das informações para exemplo do sistema
        aluno.nome = "Pedro, ";
        aluno.idade = 17;
        aluno.turma = ", 3° Colegial";
        System.out.println(aluno.nome + aluno.idade + aluno.turma);
        prof.nome = "Mauro, ";
        prof.idade = 60;
        prof.materia = ", Matemática";
        System.out.println(prof.nome + prof.idade + prof.materia);
    }
}

class Pessoa {
    String nome;
    int idade; 
}

class Aluno extends Pessoa {
    String turma;
}

class Professor extends Pessoa {
    String materia;
}