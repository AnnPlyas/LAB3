public class LibrarySystem {
    public static void main(String[] args) {
        // Фабрики
        LibraryResourceFactory bookFactory = new BookFactory();
        LibraryResourceFactory journalFactory = new JournalFactory();
        LibraryResourceFactory electronicFactory = new EbookFactory();

        // Каталог
        Catalog catalog = new Catalog();

        // Створення ресурсів
        LibraryResource book = bookFactory.createResource("Effective Java");
        LibraryResource journal = journalFactory.createResource("Nature");
        LibraryResource eResource = electronicFactory.createResource("Java Tutorials Online");

        // Додавання до каталогу
        catalog.addResource(book);
        catalog.addResource(journal);
        catalog.addResource(eResource);

        // Операції
        LibraryOperations operations = new LibraryOperations();
        operations.issueResource("Alice", book);
        operations.returnResource("Alice");
    }
}


