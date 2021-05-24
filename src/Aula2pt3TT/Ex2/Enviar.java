package Aula2pt3TT.Ex2;

public class Enviar {

    public static void main(String[] args) {

        GeometricFigure gf[] = new GeometricFigure[3];
        gf[0] = new Circulo(4.0);
        gf[0].area();
        gf[1] = new Triangulo(3.0, 2.0);
        gf[1].area();
        gf[2] = new Retangulo(3.0, 4.0);
        gf[2].area();

        System.out.println(areaMedia(gf));

    }

    public static double areaMedia(GeometricFigure arr[]) {
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].area();
            System.out.println(sum);
        }
        return sum / arr.length;


    }
}
