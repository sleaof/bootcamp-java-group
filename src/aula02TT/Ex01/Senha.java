package aula02TT.Ex01;

import java.io.IOException;
import java.util.regex.Pattern;

public class Senha {

    private String regex;
    private String senha;

    public Senha(String regex){
        this.regex = regex;
    }

    public boolean validaSenha(String senha){
        /*
        Pattern.compile = Instancia uma pattern, passando o regex a ser validado
        matcher = E as conjunto de caracteres que vamos verificar
        matches=
         */
        return Pattern.compile(regex).matcher(senha).matches();
    }

    public void setValue(String senha){
            if(!validaSenha(senha)){
                throw new InvalidPassordException ("Senha Inválida" );
            }
            System.out.println("senha passou");
            this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
