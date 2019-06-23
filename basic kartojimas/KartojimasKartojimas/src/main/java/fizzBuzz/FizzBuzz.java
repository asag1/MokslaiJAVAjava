package fizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static String konversijaString(int i) {

        return IntStream.rangeClosed(1, i)
                .mapToObj(number -> number % 3 == 0 ? (number % 5 == 0 ? "FizzBuzz" : "Fizz")
                        : (number % 5 == 0 ? "Buzz" : String.valueOf(number)))
                .collect(Collectors.joining());
    }
}