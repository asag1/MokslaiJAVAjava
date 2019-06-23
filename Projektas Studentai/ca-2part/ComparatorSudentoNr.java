package comparator.nrVienas;

import java.util.Comparator;

public class ComparatorSudentoNr implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getSudentoNr(), o2.getSudentoNr());
    }
}
