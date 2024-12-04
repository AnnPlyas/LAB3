public class JournalFactory extends LibraryResourceFactory {
    @Override
    public LibraryResource createResource(String title) {
        return new Journal(title);
    }
}
