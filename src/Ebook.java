public class Ebook implements LibraryResource {
    private String title;

    public Ebook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return "Електронний ресурс";
    }
}