public class Vetor_01 {
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de inteiros com 5 elementos
        int[] vetor = new int[5];
        
        // Atribuindo valores aos elementos do vetor
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        
        // Acessando e exibindo os elementos do vetor
        System.out.println("Elemento 1: " + vetor[0]);
        System.out.println("Elemento 2: " + vetor[1]);
        System.out.println("Elemento 3: " + vetor[2]);
        System.out.println("Elemento 4: " + vetor[3]);
        System.out.println("Elemento 5: " + vetor[4]);
        
        // Obtendo o tamanho do vetor
        int tamanho = vetor.length;
        System.out.println("Tamanho do vetor: " + tamanho);
    }
}
