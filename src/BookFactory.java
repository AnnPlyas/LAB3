public class BookFactory extends LibraryResourceFactory {
    @Override
    public LibraryResource createResource(String title) {
        return new Book(title);
    }
}