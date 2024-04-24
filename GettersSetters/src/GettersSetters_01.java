import java.util.Scanner;

public class GettersSetters_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de um objeto Pessoa
        Pessoa pessoa = new Pessoa();

        // Solicita ao usuário que insira o nome
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        // Define o nome da pessoa usando o método setter
        pessoa.setNome(nome);

        // Solicita ao usuário que insira a idade
        System.out.print("Digite a idade da pessoa: ");
        int idade = Integer.parseInt(scanner.nextLine()); //Converte o valor de String para Int

        // Define a idade da pessoa usando o método setter
        pessoa.setIdade(idade);

        // Exibe as informações da pessoa usando os métodos getters
        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        scanner.close();
    }
}

// Classe Pessoa que representa uma pessoa com nome e idade
class Pessoa {
    // Declaração de atributos privados
    private String nome; // Atributo para armazenar o nome da pessoa
    private int idade;    // Atributo para armazenar a idade da pessoa

    // Métodos getters e setters para acessar e modificar o nome da pessoa

    // Método getter para o atributo 'nome'
    public String getNome() {
        return nome; // Retorna o valor atual do atributo 'nome'
    }

    // Método setter para o atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome; // Define o valor do atributo 'nome' com o valor passado como argumento
    }

    // Métodos getters e setters para acessar e modificar a idade da pessoa

    // Método getter para o atributo 'idade'
    public int getIdade() {
        return idade; // Retorna o valor atual do atributo 'idade'
    }

    // Método setter para o atributo 'idade'
    public void setIdade(int idade) {
        this.idade = idade; // Define o valor do atributo 'idade' com o valor passado como argumento
    }
}
