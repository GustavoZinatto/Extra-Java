public class Heranca_04 {
    public static void main(String[] args) {
        
    Funcionario func = new Funcionario();
    Gerente ger = new Gerente();
    
    // Definindo informações
    func.setNome("Pedro", "Jão");
    func.setIdade(30);
    func.setSalario(3000);
    
    ger.setNome("Alice", "Silva"); // Exemplo de sobrecarga de método
    ger.setIdade(40);
    ger.setSalario(5000);
    ger.setDepartamento("Engenharia");
    
    // Chamando métodos
    func.exibeDetalhes();
    ger.exibeDetalhes();

    }
}

//Criação da classe Pai
class Pessoa {
    String nome;
    int idade; 

    void exibeDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

//Criação da primeira Classe Filha
class Funcionario extends Pessoa {
    double salario;

    //indicar que um método na subclasse está sobrescrevendo um método na superclasse
    @Override
    void exibeDetalhes() {
        super.exibeDetalhes(); //Chama o método da Classe Pai
        //A palavra-chave super é utilizada para acessar membros da classe pai (superclasse) a partir de uma subclasse.
        System.out.println("Salário: " + salario);

        //Ou seja, além da exibição padrão da classe Pessoa, a sobreposição permitiu adicionar a exibição do salario
    }

    //Método Setter para nome e sobrenome
    void setNome(String nome, String sobrenome) {
        this.nome = nome + " " + sobrenome;
    }

    //Método Setter para idade
    void setIdade(int idade) {
        if(idade >= 18) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    //Método Setter para salário
    void setSalario(double salario) {
        this.salario = salario;
    }
}

//Criação da outra classe filha
class Gerente extends Funcionario {
    String departamento;

    @Override
    void exibeDetalhes() {
        super.exibeDetalhes();
        System.out.println("Departamento: " + departamento);
    }

    void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
