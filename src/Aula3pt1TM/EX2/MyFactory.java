package Aula3pt1TM.EX2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.Properties;

public class MyFactory {

    public static Sorter getInstance(String key) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties properties =  new Properties();

        try {
            properties.load(new FileInputStream("./src/MyFactory.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (Sorter) Class.forName(properties.get(key).toString()).getConstructor().newInstance();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Integer[] arr = new Integer[100000];
        for (int i = 99999; i >= 0; i--)
            arr[99999 - i] = i;

        Comparator<Integer> c = (i1, i2) -> i2 - i1;


        Sorter sorter = SorterFactory.getInstance("sorter");

        Timer timer = new Timer();
        timer.start();

        sorter.sort(arr, c);

        timer.stop();

        for (Integer i: arr) {
            System.out.println(i);
        }

        System.out.println("Tardó "+ timer.getElapsedTime() + " ms.");
    }
}
