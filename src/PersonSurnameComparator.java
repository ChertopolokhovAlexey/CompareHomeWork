import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person> {
    protected int size;

    public PersonSurnameComparator(int size) {
        this.size = size;
    }

    @Override
    public int compare(Person o2, Person o1) {
        int first = o1.setSurname().split(" ").length;
        int second = o2.setSurname().split(" ").length;
        int result = first >= size && second >= size? 0: Integer.compare(first, second);
        return result == 0 ? o1.compareTo(o2): result;
    }
}
// мой вариант доработанной работы который я хотел сдавать:
//if (first > size) {first = size;}
//if (second > size) {second = size;}
//if (first == second) {return Integer.compare(o1.setAge(), o2.setAge());}
//return Integer.compare(first, second);
