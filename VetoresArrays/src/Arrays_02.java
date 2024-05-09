import java.util.ArrayList;

public class Arrays_02 {
    public static void main(String[] args) {

        /*
         * O uso dos símbolos <> em Java é conhecido como "diamond operator" e é usado para inferir o 
         * tipo de dados em tempo de compilação quando estamos lidando com tipos genéricos, como é o caso do ArrayList.
         */
        // Criando um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();
        
        // Adicionando elementos ao ArrayList
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");
        
        // Acessando e imprimindo os elementos do ArrayList
        System.out.println("Elementos do ArrayList:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        // Verificando o tamanho do ArrayList
        System.out.println("Tamanho do ArrayList: " + nomes.size());
    }
}
