package aula04TM.lachiqui;

public class ConvidadoMeli extends ComerBolo {

    private String name;
    private String setor;
    private Integer idade;

    public ConvidadoMeli(){
    }

    public ConvidadoMeli(String name, String setor, Integer idade) {
        this.name = name;
        this.setor = setor;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ConvidadoMeli: " +
                "name= " + name +
                "\n setor='" + setor +
                "\nidade=" + idade;
    }

    @Override
    public void comerBolo() {
        System.out.println("Viva la Chiqui");
    }
}
