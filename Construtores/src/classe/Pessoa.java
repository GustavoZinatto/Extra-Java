package classe;

public class Pessoa {
    //Atributos da classe
    private String nome;
    private int idade;
    private float altura;

    //Método Construtor
    // <Modificador> <NomeDaClasse>()
    //Assim que acontece a instanciação, ele vai ser o primeiro a ser executado
    //Dica: Crie Métodos com no máximo 4 parâmetros, para não virar bagunça
    public Pessoa(String nome, int idade, float altura) {
        System.out.println("Uma pessoa acaba de nascer! Parabéns!");
        //this indica que é o "nome" da classe, e não do argumento
        this.nome = nome; 
        this.idade = idade; //A idade  dessa classe recebe os parâmetros de Pessa
        this.altura = altura;
    }
    
    public void ImprimirDados() {
        System.out.format("Nome: %s, idade = %d e %.2fm \n", 
        nome,
        idade,
        altura);
    }
    

    //Métodos Getters e Setters 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
  
}
