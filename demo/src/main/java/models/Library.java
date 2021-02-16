package models;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Library {
    private final String name;
    private final String website;
    private final Integer established;
    private final Map<Department, List<Book>> booksByDepartment;

    public Library(String name, String website, Integer established, Map<Department, List<Book>> booksByDepartment) {
        this.name = name;
        this.website = website;
        this.established = established;
        this.booksByDepartment = booksByDepartment;
    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public Integer getEstablished() {
        return established;
    }

    public Map<Department, List<Book>> getBooksByDepartment() {
        return booksByDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(website, library.website) && Objects.equals(established, library.established) && Objects.equals(booksByDepartment, library.booksByDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, website, established, booksByDepartment);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", established=" + established +
                ", booksByDepartment=" + booksByDepartment +
                '}';
    }
}
