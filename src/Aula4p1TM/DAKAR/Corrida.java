package Aula4p1TM.DAKAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int qtdVeiculos;
    private List<Veiculo> veiculos = new ArrayList<>();
    private Veiculo vistoria;


    public Corrida(double distancia, double premioEmDolares, String nome, int qtdVeiculos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.qtdVeiculos = qtdVeiculos;
    }

        public Veiculo getVistoria() {
        return vistoria;
    }

    public void setVistoria(Veiculo vistoria) {
        this.vistoria = vistoria;
    }

    public void registrarCarro(Veiculo c) {

        veiculos.add(c);
    }

    public void registrarMoto(Veiculo m) {
        veiculos.add(m);
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (veiculo == veiculo) {
            veiculos.remove(veiculo);
        } else {
            System.out.println("Veiculo não encontrado");
        }
    }

    public void removerVeiculoPorPlaca(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca() == placa) {
                veiculos.remove(v);
            } else System.out.println("O veiculo com essa placa, não esta na competição");
        }
    }

    public void iniciarCorrida() {
        Random r11 = new Random();
        int r1 = r11.nextInt(veiculos.size());
        Random r22 = new Random();
        int r2 = r22.nextInt(veiculos.size());
        Double x = veiculos.get(r1).getVelocidade() + veiculos.get(r1).getAceleracao() / veiculos.get(r1).getPeso() - veiculos.get(r1).getRodas() * 100;
        Double y = veiculos.get(r2).getVelocidade() + veiculos.get(r2).getAceleracao() / veiculos.get(r2).getPeso() - veiculos.get(r2).getRodas() * 100;
        if (x > y) {
            System.out.println("Carro   " + veiculos.get(r1) + "   foi o vencedor");
            vistoria =  veiculos.get(r2);
        }
        if (x < y) {
            System.out.println("Carro    " + veiculos.get(r2) + "   foi o vencedor");
            vistoria =  veiculos.get(r1);
        }
        if (x.equals(y)) {
            System.out.println("Os carros empataram \n" + veiculos.get(r1) + " \n " + veiculos.get(r2));
            vistoria =  veiculos.get(r1);
            vistoria =  veiculos.get(r2);
        }
    }


    public void socorrer(int x) {
        System.out.println(vistoria.getRodas());;
        if (vistoria != null && vistoria.getRodas() == 2 ){
            System.out.println("Socorrendo Moto");
        }
    }

    public void socorrer() {
        if(vistoria != null && vistoria.getRodas() == 4 ){
            System.out.println("Socorrendo Carro");
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolares() {

        return premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVeiculos() {
        return qtdVeiculos;

    }

    public void setQtdVeiculos(int qtdVeiculos) {
        this.qtdVeiculos = qtdVeiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", qtdVeiculos=" + qtdVeiculos +
                ", veiculos=" + veiculos +
                '}';
    }


}
