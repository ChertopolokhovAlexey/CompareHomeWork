public class Person implements Comparable<Person> {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String surname, String name, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String setSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "\n" + name + " " + surname + " " + age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.age);
    }
}
