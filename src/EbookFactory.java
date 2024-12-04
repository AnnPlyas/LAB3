public class EbookFactory extends LibraryResourceFactory {
    @Override
    public LibraryResource createResource(String title) {
        return new Ebook(title);
    }
}