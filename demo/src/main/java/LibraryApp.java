import data.Libraries;
import statistics.LibraryStatistics;

import java.util.Arrays;
import java.util.List;

import models.Library;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryStatistics stats = new LibraryStatistics();

        System.out.println("Total number of books in Library of Alexandria: " +
                stats.countBooks(Libraries.LIBRARY_OF_ALEXANDRIA));
        System.out.println("Total pages by department in New York Public Library: " +
                stats.totalPagesByDepartment(Libraries.NEW_YORK_PUBLIC_LIBRARY));

        List<Library> allLibraries = Arrays.asList(
                Libraries.NEW_YORK_PUBLIC_LIBRARY,
                Libraries.BRITISH_LIBRARY,
                Libraries.LIBRARY_OF_ALEXANDRIA
        );
        System.out.println("Total pages in oldest library (Alexandria): " + stats.totalPagesInOldestLibrary(allLibraries));

    }

}
