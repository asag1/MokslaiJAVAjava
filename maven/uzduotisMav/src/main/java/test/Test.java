package test;


import org.ajbrown.namemachine.Gender;
import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import java.util.List;
public class Test {

    public static void main(String[] args) {

        NameGenerator generator = new NameGenerator();

        List<Name> names = generator.generateNames(10, Gender.MALE);

        names.forEach(System.out::println);

    }

}
