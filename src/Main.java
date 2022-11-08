import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static final int SIZE = 2;

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("ibn al Azi", "Alladin", 32));
        person.add(new Person("fon Sidorov", "Piter", 31));
        person.add(new Person("Ivanov", "Ivan", 33));
        person.add(new Person("Ivanov", "Oleg", 31));
        person.add(new Person("Ivanov", "Alex", 38));
        person.add(new Person("ibn al Azi", "Suleiman", 40));
        person.add(new Person("fon Petrov", "Piter", 33));
        person.add(new Person("ibn al Azi", "Alladin", 30));
        person.add(new Person("fon Sidorov", "Piter", 18));

        Comparator<Person> comparator = (p2, p1) -> {
            int first = p1.setSurname().split("\\P{IsAlphabetic}+").length;
            int second = p2.setSurname().split("\\P{IsAlphabetic}+").length;
            int result = first >= SIZE && second >= SIZE ? 0 : Integer.compare(first, second);
            return result == 0 ? p1.compareTo(p2) : result;
        };

        Collections.sort(person, comparator);
        System.out.println(person);
    }
}
