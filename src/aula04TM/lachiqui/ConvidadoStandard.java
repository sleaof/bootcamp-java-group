package aula04TM.lachiqui;

public class ConvidadoStandard extends ComerBolo {

    private String name;
    private String empresa;
    private Integer idade;

    public ConvidadoStandard(){
    }

    public ConvidadoStandard(String name, String empresa, Integer idade) {
        this.name = name;
        this.empresa = empresa;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ConvidadoStandard: " +
                "\nname='" + name +
                "\nempresa='" + empresa +
                "\nidade=" + idade;
    }

    @Override
    public void comerBolo() {

    }
}
