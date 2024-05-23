//Criação da classe abstrata
abstract class Veiculo {
    private String modelo;

    //Criação do método Construtor
    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    //Criação do método abstrato para Calcular preço do modelo

    public abstract double calcularPrecoAluguel();

    //Ciração do método Getter
    public String getModelo() {
        return modelo;
    }
}

//Subclasse que extende Veículo
class Carro extends Veiculo {
    private int ano;
    private boolean arcondicionado;

    //Criação do método Construtor
    public Carro(String modelo, int ano, boolean arcondicionado) {
        super(modelo);
        this.ano = ano;
        this.arcondicionado = arcondicionado;
    }

    //Sobrescrição do método calcularPrecoAluguel
    @Override 
    public double calcularPrecoAluguel() {
        double precoBase = 100.00;
        if (arcondicionado) {
            precoBase += 50;
        }
        return precoBase;
    }
}

//Subclasse que extente Veiculo
class Moto extends Veiculo {
    int cilindradas;

    //Método Construtor
    public Moto(String modelo, int cilindradas) {
        super(modelo);
        this.cilindradas = cilindradas;
    }

    //Sobrescrição do Método calcularPrecoAluguel
    @Override
    public double calcularPrecoAluguel() {
        return 70.00 + (cilindradas / 100);
    }
}

//Classe Main onde acontecerá o Polimorfismo
public class Polimorfismo_02 {
    public static void main(String[] args) {
        Veiculo[] frota = new Veiculo[4];
        frota[0] = new Carro("Fiat Uno", 2015, true);
        frota[1] = new Moto("Honda CG 125", 125);
        frota[2] = new Carro("VW Gol", 2018, false);
        frota[3] = new Moto("Hornet", 160);

        for (Veiculo veiculo : frota) {
            System.out.println("Modelo: " + veiculo.getModelo() + " Preço: " + veiculo.calcularPrecoAluguel());
        }
    }
}
