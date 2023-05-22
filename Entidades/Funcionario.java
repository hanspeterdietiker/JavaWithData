package Entidades;

public class Funcionario {

    private String Nome;
    private Integer Horas;
    private Double ValorPorHora;

    public Funcionario(){

    }

    public Funcionario(String nome, Integer horas, Double valorPorHora) {
        this.Nome = nome;
        this.Horas = horas;
        this.ValorPorHora = valorPorHora;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getHoras() {
        return Horas;
    }

    public void setHoras(Integer horas) {
        Horas = horas;
    }

    public Double getValorPorHora() {
        return ValorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        ValorPorHora = valorPorHora;
    }

    public double pagamento(){
        return Horas * ValorPorHora;
    }

}
