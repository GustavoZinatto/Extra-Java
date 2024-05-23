//Definição da superClasse

class FormaGeometrica {
    public void desenhar() {
        System.out.println("Desenhando uma forma geométrica...");
    }
}

// Definição da subclasse Retangulo, que estende a classe FormaGeometrica
class Retangulo extends FormaGeometrica {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Retângulo");
    }
}

class Circulo extends FormaGeometrica {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Círculo");
    }
}

//Main para execução do código
public class Polimorfismo_01 {
    public static void main(String[] args) {
        
        //Criação de um objeto do Tipo FormaGeometrica que aponta para a classe Retangulo
        FormaGeometrica forma1 = new Retangulo();
        //Invocando o método desenhar da classe Retangulo
        forma1.desenhar();

        //Criação de um objeto do Tipo FormaGeometrica que aponta para a classe Retangulo
        FormaGeometrica forma2 = new Circulo();
        //Invocando o método desenhar da classe Retangulo
        forma2.desenhar();

    }
}


