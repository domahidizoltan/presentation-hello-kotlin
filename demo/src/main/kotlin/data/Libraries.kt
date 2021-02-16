val `New York Public Library` = Library(
    name = "New York Public Library", website = "www.nypl.org", established = 1895,
    booksByDepartment = mapOf(
        Department.GEOGRAPHY to listOf(`Geographies of Mediterranean Europe`, `The Changing Geography of Asia`),
        Department.HISTORY to listOf(`Killing Hope`),
        Department.LITERATURE to listOf(`Crime and Punishment`, `Romeo and Juliet`)
    )
)

val `British Library` = Library(
    name = "British Library", website = "www.bl.uk", established = 1973,
    booksByDepartment = mapOf(
        Department.LITERATURE to listOf(`Romeo and Juliet`, `The Ultimate Hitchhiker's Guide to the Galaxy`),
        Department.HISTORY to listOf(`The History of Ancient Egypt`, `The Second World War`, `Napoleon and the Transformation of Europe`),
    )
)

val `Library of Alexandria` = Library(
    name = "Library of Alexandria", established = -260,
    booksByDepartment = mapOf(
        Department.SCIENCE to listOf(Chemistry, `Basic Physics`),
        Department.HISTORY to listOf(`Encyclopedia of World History`),
        Department.GEOGRAPHY to listOf(`Descriptive Physical Geography`, `Geographies of Mediterranean Europe`, `The Changing Geography of Asia`)
    )
)