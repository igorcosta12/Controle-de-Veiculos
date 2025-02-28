
abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int capacidadePassageiros;
    protected String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Combustível: " + combustivel);
    }
}


class Carro extends Veiculo {
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return 50 * 12; 
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de Carro: " + tipoCarro);
    }
}

class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double consumoBase = 6; 
        double reducaoConsumo = Math.min(capacidadeCarga * 0.01, 0.25); 
        double consumoFinal = consumoBase * (1 - reducaoConsumo);
        return 300 * consumoFinal; 
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}

// Classe Onibus
class Onibus extends Veiculo {
    private int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("Ônibus deve ter entre 6 e 8 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia() {
        return 200 * 5; 
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}

class CarroEletrico extends Carro {
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * 5;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Bateria: " + bateriaKWh + " kWh");
    }
}

class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        return super.calcularAutonomia() * 0.9; // Redução de 10% na autonomia
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Temperatura Mínima: " + temperaturaMinima + " °C");
    }
}
