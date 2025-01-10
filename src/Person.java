import java.util.concurrent.atomic.AtomicInteger;

public class Person implements Comparable<Person> {
    private static final AtomicInteger idCounter = new AtomicInteger();
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter.incrementAndGet();
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public int compareTo(Person other) {
        return 0; // To be implemented later
    }
}
