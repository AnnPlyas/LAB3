import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private final List<LibraryResource> resources = new ArrayList<>();

    public void addResource(LibraryResource resource) {
        resources.add(resource);
        System.out.println(resource.getType() + " \"" + resource.getTitle() + "\" додано до каталогу.");
    }

    public List<LibraryResource> getResources() {
        return resources;
    }
}
