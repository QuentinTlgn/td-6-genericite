package exo3p2;

import java.util.Random;

public class Exo3p2<T> {
    public Exo3p2() {
    }


    public static <T> T random(T obj1, T obj2){
        Random rnd = new Random();
        T res = obj1;

        if(rnd.nextBoolean())
            res = obj1;
        return res;
    }
}
