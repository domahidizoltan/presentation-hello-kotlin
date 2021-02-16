class LibraryStatistics {

//    fun countBooks(library: Library): Int {
//        val listOfBooks = library.booksByDepartment.values
//        var sum = 0
//        for(books in listOfBooks)
//            sum += books.size
//        return sum
//    }

    fun countBooks(library: Library) =
        library.booksByDepartment.values
            .map { it.size }
            .sum()

    fun totalPagesByDepartment(library: Library) =
        library.booksByDepartment.entries
            .map { (department, books) -> department to books.sumBy { it.pages } }
            .toMap()

    fun totalPagesInOldestLibrary(libraries: List<Library>) =
        libraries
            .minByOrNull { it.established }!!
            .booksByDepartment.values
            .flatten()
            .sumBy { it.pages }

}

fun main() {
    val stats = LibraryStatistics()

    println("Total number of books in Library of Alexandria: ${stats.countBooks(`Library of Alexandria`)}")
    println("Total pages by department in New York Public Library: ${stats.totalPagesByDepartment(`New York Public Library`)}")

    val allLibraries = listOf(
        `New York Public Library`,
        `British Library`,
        `Library of Alexandria`
    )
    println("Total pages in oldest library (Alexandria): ${stats.totalPagesInOldestLibrary(allLibraries)}")

}

