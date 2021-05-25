package aula04TM.lachiqui;

public class application {

    public static void main(String[] args) {
        LaChiqui evento = new LaChiqui("Vela");

        FogosPacote f1 = new FogosPacote();
        f1.adicionarFogosPacote("BOmmm");
        f1.adicionarFogosPacote("Colorido");
        f1.adicionarFogosPacote("Estrela Colorida");
        evento.getFogos2().add(f1);



        ConvidadoMeli cMeli = new ConvidadoMeli("Gabriel", "IT", 23);
        ConvidadoMeli cMeli2 = new ConvidadoMeli("Bruna", "Marcketing", 22);

        ConvidadoStandard cStandard = new ConvidadoStandard("Lucas", "STP", 34);
        ConvidadoStandard cStandard2 = new ConvidadoStandard("Jessica", "Bradesco", 30);

        evento.getConvidadoMeli().add(cMeli);
        evento.getConvidadoMeli().add(cMeli2);
        evento.getConvidadoStandar().add(cStandard);
        evento.getConvidadoStandar().add(cStandard2);

        evento.apagarVela();

        evento.servirBolo();
    }

}
