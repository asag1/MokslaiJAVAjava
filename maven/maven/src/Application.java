import org.ajbrown.namemachine.Name;
import org.ajbrown.namemachine.NameGenerator;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        NameGenerator generator = new NameGenerator();

        List<Name> listOfNames = generator.generateNames(1000);

        System.out.println(listOfNames);

    }
}