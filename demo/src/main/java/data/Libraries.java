package data;

import models.Book;
import models.Department;
import models.Library;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Libraries {

    public static final Library NEW_YORK_PUBLIC_LIBRARY =
            new Library("New York Public Library", "www.nypl.org", 1895, createNewYorkPublicLibraryBooks());

    private static Map<Department, List<Book>> createNewYorkPublicLibraryBooks() {
        Map<Department, List<Book>> map = new HashMap();
        map.put(Department.GEOGRAPHY, Arrays.asList(Books.GEOGRAPHIES_OF_MEDITERRANEAN_EUROPE, Books.THE_CHANGING_GEOGRAPHY_OF_ASIA));
        map.put(Department.HISTORY, Arrays.asList(Books.KILLING_HOPE));
        map.put(Department.LITERATURE, Arrays.asList(Books.CRIME_AND_PUNISHMENT, Books.ROMEO_AND_JULIET));
        return map;
    }


    public static final Library BRITISH_LIBRARY =
            new Library("British Library", "www.bl.uk", 1973, createBritishLibraryBooks());

    private static Map<Department, List<Book>> createBritishLibraryBooks() {
        Map<Department, List<Book>> map = new HashMap();
        map.put(Department.LITERATURE, Arrays.asList(Books.ROMEO_AND_JULIET, Books.THE_ULTIMATE_HITCHHIKERS_GUIDE_TO_THE_GALAXY));
        map.put(Department.HISTORY, Arrays.asList(Books.THE_HISTORY_OF_ANCIENT_EGYPT, Books.THE_SECOND_WORLD_WAR, Books.NAPOLEON_AND_THE_TRANSFORMATION_OF_EUROPE));
        return map;
    }

    public static final Library LIBRARY_OF_ALEXANDRIA =
            new Library("Library of Alexandria", null, -260, createLibraryOfAlexandriaBooks());

    private static Map<Department, List<Book>> createLibraryOfAlexandriaBooks() {
        Map<Department, List<Book>> map = new HashMap();
        map.put(Department.SCIENCE, Arrays.asList(Books.CHEMISTRY, Books.BASIC_PHYSICS));
        map.put(Department.HISTORY, Arrays.asList(Books.ENCYCLOPEDIA_OF_WORLD_HISTORY));
        map.put(Department.GEOGRAPHY, Arrays.asList(Books.DESCRIPTIVE_PHYSICAL_GEOGRAPHY, Books.GEOGRAPHIES_OF_MEDITERRANEAN_EUROPE, Books.THE_CHANGING_GEOGRAPHY_OF_ASIA));
        return map;
    }

}
