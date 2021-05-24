package aula02TT.Ex01;

//Excessao personalizada
public class InvalidPassordException extends RuntimeException{

    public InvalidPassordException  (String invalido){
        super(invalido);
    }
}
