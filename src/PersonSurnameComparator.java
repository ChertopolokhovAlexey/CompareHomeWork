import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    protected int size;

    public PersonSurnameComparator(int size) {
        this.size = size;
    }

    @Override
    public int compare(Person o2, Person o1) {
        int first = o1.setSurname().split("\\P{IsAlphabetic}+").length;
        int second = o2.setSurname().split("\\P{IsAlphabetic}+").length;
        int result = first >= size && second >= size? 0: Integer.compare(first, second);
        return result == 0 ? o1.compareTo(o2): result;
    }
}
