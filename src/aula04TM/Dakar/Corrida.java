package aula04TM.Dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida{

    private Double distancia;
    private Double premioEmDolres;
    private String nome;
    private Integer qtdVeiculosPermitidos;
    SocorristaCarro socorristaCarro = new SocorristaCarro();
    SocorristoMoto  socorristaMoto  = new SocorristoMoto();


    List<Veiculo> veiculos = new ArrayList<>();

    public Corrida(Double distancia, Double premioEmDolres, String nome, Integer qtdVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolres = premioEmDolres;
        this.nome = nome;
        this.qtdVeiculosPermitidos = qtdVeiculosPermitidos;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getPremioEmDolres() {
        return premioEmDolres;
    }

    public void setPremioEmDolres(Double premioEmDolres) {
        this.premioEmDolres = premioEmDolres;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdVeiculosPermitidos() {
        return qtdVeiculosPermitidos;
    }

    public void setQtdVeiculosPermitidos(Integer qtdVeiculosPermitidos) {
        this.qtdVeiculosPermitidos = qtdVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void registrarCarro(Carro c){
        veiculos.add(c);
    }

    public void registrarMoto(Moto m){
        veiculos.add(m);
    }

    public void removerVeiculo(Veiculo v){
        veiculos.remove(v);
    }

    public void removerVeiculoPorPlaca(String placa){
        boolean temCarro = false;
        for(Veiculo v : veiculos){
            if (v.getPlaca() == placa){
                veiculos.remove(v);
                qtdVeiculosPermitidos++;
                temCarro = true;
                break;
            }
        }
        if(temCarro == true){
            System.out.println("Carro removido");
        }
        else System.out.println("Carro nao encontrado");

    }

    public Veiculo vencedorDaCorrida(){
        double valorMax = 0.0;
        double aux = 0.0;
        Veiculo vencedor = new Veiculo();
        for (Veiculo v : veiculos){
            valorMax = valorMaximo(v);
            if(valorMax > aux){
                aux = valorMax;
                vencedor = v;
            }
        }
        return vencedor;
    }

    public Double valorMaximo(Veiculo v){
        return v.getVelocidade() * v.getAceleracao() / (v.getAnguloDeGiro() * (v.getPeso() - v.getRodas()));
    }

    public void socorrerCarro(String documento) {
        for(Veiculo v : veiculos) {
            if(v.getPlaca().equals(documento)) {
                socorristaCarro.socorrer(v);
            }
        }
    }

    public void socorrerMoto(String documento) {
        for(Veiculo v : veiculos) {
            if(v.getPlaca().equals(documento)) {
                socorristaMoto.socorrer(v);
            }
        }
    }


}
