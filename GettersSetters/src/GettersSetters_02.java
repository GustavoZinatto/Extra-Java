//Mesmo exemplo do exercício um porém sendo criado do zero para entender melhor

import java.util.Scanner;

public class GettersSetters_02 {
    public static void main(String[] args) {

        //Criação do Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        String entradaNome;

        //Instanciação para classe Pessoa
        Pessoa pessoa = new Pessoa();

        //Entrada de Dados
        System.out.println("Digite o seu Primeiro Nome: ");
        entradaNome = scanner.nextLine();

        //Método Setter - Método setNome recebe valor da String entradaNome
        pessoa.setNome(entradaNome);

        //Método Getter para acessar a String Private
        System.out.println("O seu nome é: " + pessoa.getNome());

        scanner.close();
    }
}


class Pessoa {

    // Criação do métodos privados para garantir encapsulamento, ou seja, para proteger os dados e controlar seu acesso.
    private String nome;

    public void setNome(String nome) {
        //Atribuição do valor do parâmetro para o atributo
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
