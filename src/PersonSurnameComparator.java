import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    int size;

    public PersonSurnameComparator(int SIZE) {
        this.size = SIZE;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int first = o1.setSurname().split(" ").length;
        int second = o2.setSurname().split(" ").length;
        if (first > size && second > size) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        if (first > size) {
            return Integer.compare(size, o2.setSurname().split(" ").length);
        }
        if (second > size) {
            return Integer.compare(size, o2.setSurname().split(" ").length);
        }

        return Integer.compare(o1.setSurname().split(" ").length, o2.setSurname().split(" ").length);
    }
}

