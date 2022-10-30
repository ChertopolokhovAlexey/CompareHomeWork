import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static final int SIZE = 2;

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("fon Petrov", "Piter", 33));
        person.add(new Person("ibn al Azi", "Alladin", 35));
        person.add(new Person("fon Sidorov", "Piter", 38));
        person.add(new Person("Ivanov", "Ivan", 35));

        Collections.sort(person, new PersonSurnameComparator(SIZE));
        System.out.println(person);
    }
}
