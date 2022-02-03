package homeWork;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return " Автрор - " + this.name + " " + this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Author a = (Author) other;
        return name.equals(a.name) && surname.equals(a.surname);

    }
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

