package Aula2pt3TT.Ex1;

public class Senha {

        private String password;
        private String regex;

    public Senha(String regex) {
        this.regex = regex;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setValue (String pwd) {

        String x;
        x = String.valueOf(pwd.matches(regex));

        if (x == "true") {
            setPassword(pwd);
            System.out.println("Senha correta");
        }else{
            System.out.println("Reinicie o programa e digite novamente a senha");
        }

    }

    @Override
    public String toString() {
        return "Senha{" +
                "password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Senha s1 = new Senha("\\w{1,9}");
        SenhaFraca sf = new SenhaFraca("(?i)\\d{1,8}");
        SenhaMedia sm = new SenhaMedia("(?i)\\w{1,8}\\d{1,8}\\.");
        SenhaForte sfo = new SenhaForte("(?i)\\w{1,8}\\d{1,8}\\.{1,8}");
        s1.setValue("Adsf1234");
        sf.setValue("1234213");
        sm.setValue("sdaw12312.");
        sfo.setValue("Agsdf12341...");

        System.out.println(s1.toString());

    }
}
