import java.util.ArrayList;
import java.util.Collections;
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




        Collections.sort(person, new PersonSurnameComparator(SIZE));
        System.out.println(person);
    }
}
