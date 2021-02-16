package statistics;

import models.Book;
import models.Department;
import models.Library;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryStatistics {

    public int countBooks(Library library) {
        return library.getBooksByDepartment().values()
                .stream()
                .mapToInt(List::size)
                .sum();
    }

    public Map<Department, Integer> totalPagesByDepartment(Library library) {
        return library.getBooksByDepartment().entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .map(Book::getPages)
                                .mapToInt(Integer::intValue)
                                .sum()
                ));
    }

    public int totalPagesInOldestLibrary(List<Library> libraries) {
        return libraries.stream()
                .min(Comparator.comparing(Library::getEstablished))
                .get()
                .getBooksByDepartment().values()
                .stream()
                .flatMap(List::stream)
                .mapToInt(Book::getPages)
                .sum();
    }

}