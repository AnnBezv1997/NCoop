package ru.ncedu.java.task.oop.Book;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name=" + name +
                ", email=" + email +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;
        return gender == author.gender &&
                name.equals(author.name) &&
                email.equals(author.email);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) gender;
        return result;
    }
}
