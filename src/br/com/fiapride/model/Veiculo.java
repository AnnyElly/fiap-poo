package br.com.fiapride.model;

public class Veiculo {

    // Atributos privados
    private String proprietario;
    private String placa;
    private double combustivel;

    // Construtor
    public Veiculo(String proprietario, String placa, double combustivel) {
        this.proprietario = proprietario;
        this.placa = placa;
        setCombustivel(combustivel); // reaproveita a validação
    }

    // Método para abastecer
    public void abastecer(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para abastecimento.");
            return;
        }
        combustivel += quantidade;
    }

    // Método para consumir combustível
    public void consumir(double quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para consumo.");
            return;
        }

        if (quantidade > combustivel) {
            System.out.println("Combustível insuficiente.");
            return;
        }

        combustivel -= quantidade;
    }

    // Get do proprietário
    public String getProprietario() {
        return proprietario;
    }

    // Set do proprietário
    public void setProprietario(String proprietario) {
        if (proprietario == null || proprietario.isEmpty()) {
            System.out.println("Nome do proprietário inválido.");
            return;
        }
        this.proprietario = proprietario;
    }

    // Get da placa
    public String getPlaca() {
        return placa;
    }

    // Get do combustível
    public double getCombustivel() {
        return combustivel;
    }

    // Set do controlado de combustível
    public void setCombustivel(double combustivel) {
        if (combustivel < 0) {
            System.out.println("Combustível não pode ser negativo.");
            this.combustivel = 0;
            return;
        }
        this.combustivel = combustivel;
    }
}