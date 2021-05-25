package aula04TM.lachiqui;

public class FogosIndividual {

    private String som;

    public FogosIndividual(String som) {
        this.som = som;
    }

    public void explodir(){
        System.out.println(this.som);
    }

    public String getSom() {
        return som;
    }
}
