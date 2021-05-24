package aula02TT.Ex02;

public class areaUtil {

    public static double areaMedia(GeometricFigure[] vect){
        double result = 0.0;
        for(GeometricFigure x : vect){
            result += x.area();
        }
        return  result /  vect.length;
    }
}
