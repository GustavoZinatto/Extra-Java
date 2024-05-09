import java.util.Arrays;

public class Arrays_01 {
    public static void main(String[] args) {
        
        // Criando um array de inteiros e inicializando com valores
        int[] numeros = {10, 20, 30, 40, 50};
        
        // Imprimindo os valores do array usando Arrays.toString()
        System.out.println("Valores do array: " + Arrays.toString(numeros));
        
        // Calculando a soma dos valores do array usando streams
        int soma = Arrays.stream(numeros).sum();
        
        // Imprimindo a soma
        System.out.println("Soma dos valores do array: " + soma);
    }
}
