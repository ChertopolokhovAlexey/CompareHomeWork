public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String surname, String name, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return surname;
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
