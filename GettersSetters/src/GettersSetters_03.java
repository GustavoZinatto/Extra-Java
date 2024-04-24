//Criação de um sistema que analisa sua conta Bancária

import java.util.Scanner;

public class GettersSetters_03 {
    public static void main (String [] args) {

        Scanner teclado = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        boolean sair = false;

        do { 
            System.out.println("\n-------OPÇÕES-------\n");
            System.out.println("1 - Verificação de Saldo");
            System.out.println("2 - Depósito em Conta");
            System.out.println("3 - Definir Limite"); 
            System.out.println("4 - Consultar Limite");
            System.out.println("5 - Sair");

            System.out.println("\nDigite a opção que você deseja: ");
            int opccao = teclado.nextInt();      

            switch (opccao) {
                case 1: 
                System.out.println("Verificação de Saldo"); 
                System.out.println("\nSeu Saldo é R$: " + conta.getSaldo());
                break;

                case 2: 
                System.out.println("Depósito em Conta"); 
                System.out.println("\nQuanto você deseja depositar?");
                double valor = teclado.nextDouble();
                conta.depositar(valor);
                break;

                case 3: 
                System.out.println("Definir Limite"); 
                System.out.println("\nQual o Limite ideal para você? ");
                double limite = teclado.nextDouble();
                conta.setLimite(limite);
                System.out.println("----------------------");
                System.out.println("Novo Limite defnido R$: " + conta.getLimite());
                break;

                case 4: 
                System.out.println("Consultar Limite");
                System.out.println("Seu Limite é de: R$" + conta.getLimite());
                break;


                case 5: 
                System.out.println("Saindo...");
                sair = true;
                break;
        
                default:
                System.out.println("Opção Inválida!"); break;
            }     

        } while(!sair);

        System.out.println("Obrigado pela visita! Volte sempre!" );
        teclado.close();
    }
}

class Operacoes {
    
}
    //Um objeto é uma instância de uma classe
 class ContaBancaria {

    private double saldo;
    private double limite;

    //Criação do método Getter
    public double getSaldo() {
        return saldo;
    }

    //Criação do Método Setter
    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            System.out.println("Limite inválido ! O Limite deve ser maior do que Zero.");
        }
    }

    //Criação do Método Getter pora o Limite
    public double getLimite() {
        return limite;
    }

    //Criação do Método para depósitos
    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.println("\nValor depositado: " + valor + " realizado com sucesso.\nNovo saldo: " + saldo);
        } else {
            System.out.println("Inválido! O valor que você desaja depositar é menor que Zero");
        }
    }

    public boolean contaNegativa() {
        return saldo < 0;
    }

}