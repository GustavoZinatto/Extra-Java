//Exemplo apenas iniciado pelo chatGPT 

// Definição da classe Animal
class Animal {
    // Método para emitir um som genérico
    void emitirSom() {
        System.out.println("Animal emite um som");
    }
}

// Definição da subclasse Dog, que herda da classe Animal
class Dog extends Animal {
    // Sobreposição do método emitSound da classe Animal
    @Override
    void emitirSom() {
        System.out.println("Cachorro late");
        System.out.println("Cachorro abana o rabo");
    }
}

public class Heranca_03 {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Dog
        Dog objDog = new Dog();
        // Chamando o método emitSound da classe Dog
        objDog.emitirSom();
    }
}
