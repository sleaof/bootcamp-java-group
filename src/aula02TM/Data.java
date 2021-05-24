package aula02TM;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data{

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    GregorianCalendar calendario = new GregorianCalendar();
    private Date data;

    public Date getData(){
         return this.data;
    }

    public boolean dataInvalida(){
        return data == null;
    }

    public void somaDia(){
        if(dataInvalida()){
            System.out.println("Data");
        }
        else
            calendario.add(Calendar.DAY_OF_MONTH, 1);
    }

    @Override
    public String toString() {
        return "Data{" +
                ", calendario=" + calendario +
                ", data=" + data +
                '}';
    }
}
