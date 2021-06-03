package ch.juventus.lambda;

import java.util.Date;
import java.util.function.Function;

public class LambdaExamples {

    public static void main(String[] args) {
        Function<Date, String> tellDateFunction = date -> "Jetzt ist " + date;
        String now = tellDateFunction.apply(new Date());
        System.out.println(now);
    }
}
