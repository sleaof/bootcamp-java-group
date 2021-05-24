package Aula2pt2TM.Ex5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data extends GregorianCalendar {

    private int dia;
    private int mes;
    private int ano;

    public Data() {

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void verificarData(String data){



                String MinhaData = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
                if (MinhaData.equals(data)) {
                    System.out.println("As datas são iguais");
                    System.out.println(data);
                    System.out.println(MinhaData);
                } else {
                    System.out.println("As datas são diferentes");
                    System.out.println(data);
                    System.out.println(MinhaData);
                }

    }

    public void modificarData(){
        dia = dia + 1;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }

    public static void main(String[] args) {

        Date data = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");
        String dataFormat = format.format(data);

        Data d1 = new Data();

        d1.setAno(22);
        d1.setMes(10);
        d1.setDia(21);
        d1.verificarData(dataFormat);


    }
}
