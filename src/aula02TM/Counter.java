package aula02TM;

public class Counter {

    private Integer valor;

    public Counter(){
    }

    public Counter(Integer valor) {
        this.valor = valor;
    }

    public Counter(Counter counter){
        this.valor = counter.getValor();
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void somar(){
        this.valor = valor++;
    }

    public void subtrair(){
        this.valor = valor --;
    }
}
