//Exercício: Crie um programa que imprima a soma dos números pares entre 1 e 100.

public class ex01_contador {
    public static void main(String[] args) throws Exception {
        
        int soma = 0;

        for(int i = 0; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma de todos os numeros de 0 a 100 é: " + soma);
        
    }
}
