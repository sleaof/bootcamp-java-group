package Aula4p1TM.DAKAR;

public abstract class Veiculo {
    private Integer velocidade;
    private Integer aceleracao;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo(Integer velocidade, Integer aceleracao, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Integer aceleracao) {
        this.aceleracao = aceleracao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
