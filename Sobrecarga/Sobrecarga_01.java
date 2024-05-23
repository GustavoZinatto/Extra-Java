
class Calculadora {
    //Método para soma de dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    //Método sobrecarregado para soma de três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    //Método sobrecarregado para soma de dois números decimais
    public double somar(double a, double b) {
        return a + b;
    }

    //A sobrecarga ocorre quando uma classe tem dois ou mais métodos com o mesmo nome, mas assinaturas diferentes. A assinatura de um método inclui o nome do método e o tipo, ordem e número de seus parâmetros.

    //Esses métodos têm o mesmo nome, mas o número e/ou tipo de parâmetros são diferentes, o que permite que a JVM (Java Virtual Machine) determine qual método deve ser chamado com base nos argumentos fornecidos. Isso é chamado de sobrecarga de métodos.
}

public class Sobrecarga_01 {
    public static void main(String[] args) {
        Calculadora objCalculadora = new Calculadora();

        //Chamando Método Soma de 2
        System.out.println("Soma de 5 + 3 = " + objCalculadora.somar(5, 3));

        //Chamando Método Soma de 3
        System.out.println("Soma de 5 + 3 + 2 = " + objCalculadora.somar(5, 3, 2));

        //Chamando Método Soma de decimais
        System.out.println("Soma de 2.5 + 3.5 = " + objCalculadora.somar(2.5, 3.5));
    }
}