//Exemplo básico gerado pelo chatGPT para conhecer aplicações

//Mãe, Pai, progenitora, superclasse são sinônimos
//Filha, Filho e subclasse são sinônimos
//Antes do extends é a filha e depois do extends é a mãe

// Classe Pai (superclasse)
class Animal {
    void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

// Classe Filho (subclasse)
class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro está latindo.");
    }
}

public class Heranca_01 {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.emitirSom(); // Chamando método da classe Animal
        dog.latir(); // Chamando método da classe Cachorro
    }
}

