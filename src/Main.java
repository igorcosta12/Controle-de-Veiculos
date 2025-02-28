public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 2, "Diesel", 10);
        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

        Onibus onibus = new Onibus("Mercedes", "O500", 2019, 50, "Diesel", 6);
        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Elétrico", "Sedan", 100);
        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

        // Testando CaminhaoRefrigerado
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2021, 2, "Diesel", 15, -20);
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
    }
}
