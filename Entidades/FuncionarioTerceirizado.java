package Entidades;

public class FuncionarioTerceirizado extends Funcionario {
    private Double Adicional;

    public FuncionarioTerceirizado() {
        super();
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double adicional) {
        super(nome, horas, valorPorHora);
        this.Adicional = adicional;
    }

    @Override
    public double pagamento() {
    return super.pagamento() + Adicional * 1.1;
    }
}