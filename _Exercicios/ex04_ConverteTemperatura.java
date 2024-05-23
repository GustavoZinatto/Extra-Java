//Objetivo: Desenvolver um programa Java simples que converta temperaturas de Celsius para Fahrenheit e vice-versa.

// Requisitos:

// Crie uma classe TemperatureConverter com os seguintes métodos: celsiusToFahrenheit(double) e fahrenheitToCelsius(double).
// Implemente os métodos da classe TemperatureConverter. A fórmula para converter Celsius para Fahrenheit é (double) (9.0/5.0 * celsius + 32) 
//e para converter Fahrenheit para Celsius é (double) ((fahrenheit - 32) * 5.0/9.0).
// Crie um menu principal no qual o usuário possa interagir com o programa, como selecionar a opção de conversão desejada e inserir o valor 
//a ser convertido.
// Dicas:

// Teste o programa para garantir que ele esteja convertendo as temperaturas corretamente.
// Use a entrada do usuário para obter o valor a ser convertido.
// Exiba uma mensagem amigável para o usuário informando o resultado da conversão.
// Boa sorte e divirta-se programando!

import java.util.Scanner;

public class ex04_ConverteTemperatura {
    public static void main(String[] args) {

        //Instanciação com a classe de Métodos
        ConverteTemperatura converte = new ConverteTemperatura();
        //Declaração do Scanner
        Scanner entrada = new Scanner(System.in);

        int resp = 0;

        //Início do Sistema
        System.out.println("Convertor de Temperatura...");

        do {
    
            System.out.println("\n 1 - Celcius para Fahrenheit \n 2 - Fahrenheit para Celcius \n 9 - Sair \nDigite: ");
            resp = entrada.nextInt();
            
            switch (resp) {
                case 1: 
                System.out.print("Digite o valor que deseja converter de Celcius para Fahrenheit: ");
                converte.celcius = entrada.nextDouble();
    
                converte.celsiusToFahrenheit(); break;
    
                case 2: 
                System.out.print("Digite o valor que deseja converter de Fahrenheit para Celcius: ");
                converte.fahrenheit = entrada.nextDouble();
    
                converte.fahrenheitToCelsius(); break;
            
                case 9: 
                System.out.println("Obrigado por participar!"); break;
    
                default:
                System.out.println("Você digitou uma opção inválida!"); break;
            } 
        } while (resp != 9);

        entrada.close();
    }
}

class ConverteTemperatura {

    double celcius = 0;
    double fahrenheit = 0;

    public void celsiusToFahrenheit() {
        fahrenheit = (9.0/5.0 * celcius + 32);
        System.out.println(celcius + " Celicius convertido, resulta em: " + fahrenheit + " Fahrenheit !");
    }

    public void fahrenheitToCelsius() {
        celcius =  ((fahrenheit - 32) * 5.0/9.0);
        System.out.println(fahrenheit + " Fahreinheit convertido, resulta em: " + celcius + " Celcius");
    }

} 