import classe.Pessoa;

public class Construtores_01 {
    public static void main(String[] args) throws Exception {

        Pessoa pessoa = new Pessoa("João", 97, 1.70f);

        pessoa.ImprimirDados();
        // pessoa.setNome("João")
        // pessoa.setIdade(47)
        // pessoa.setAltura(2.25f)
    }
}
