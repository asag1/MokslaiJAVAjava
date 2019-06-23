package Generics;

public class TestGenerics {


    public static <T> void  printArray(T[]mas){

        for (T t: mas) {

            System.out.println(t);
        }
    }

}

