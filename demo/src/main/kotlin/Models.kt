enum class Department {
    GEOGRAPHY, HISTORY, LITERATURE, SCIENCE
}

class Book(
    val title: String,
    val author: String,
    val year: Int,
    val pages: Int,
    val isbn: String? = null
)

class Library(
    val name: String,
    val website: String? = null,
    val established: Int,
    val booksByDepartment: Map<Department, List<Book>> = emptyMap()
)