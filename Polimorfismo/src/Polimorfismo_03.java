public class Polimorfismo_03 {
    public static void main(String[] args) {

        Calculadora objCalculadora = new Calculadora();
        // Polimorfismo
        // Objeto quadrado da classe figura com assinatura da classe filha Quadrado
        Figura objQuadrado = new Quadrado(6);
        Figura objCirculo = new Circulo(6.0);

        System.out.println("Área do Quadrado = " + objCalculadora.calcularArea(objQuadrado));
        System.out.println("Área do Círculo = " + objCalculadora.calcularArea(objCirculo));
    }
}

class Calculadora {
    // Método para calcular a área de uma figura
    public double calcularArea(Figura figura) {
        // Chama o método calcularArea() da figura passada como argumento
        return figura.calcularArea();
    }
}

abstract class Figura {
    // Método abstrato para calcular a área da figura
    abstract double calcularArea();
}

// Criação da classe Quadrado que extende a classe Figura
class Quadrado extends Figura {
    private double lado;

    // Construtor que recebe o lado do Quadrado
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Método para calcular a área do quadrado
    @Override
    double calcularArea() {
        return lado * lado;
    }
}

// Criação da classe Circulo que extende a classe Figura
class Circulo extends Figura {
    private double raio;

    // Construtor que recebe o raio do Circulo
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do quadrado
    @Override
    double calcularArea() {
        return Math.PI * (raio * raio); // PI x R ao quadrado
    }
}
