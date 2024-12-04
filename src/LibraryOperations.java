import java.util.HashMap;
import java.util.Map;

public class LibraryOperations {
    private final Map<String, LibraryResource> issuedResources = new HashMap<>();

    public void issueResource(String user, LibraryResource resource) {
        issuedResources.put(user, resource);
        System.out.println(resource.getType() + " \"" + resource.getTitle() + "\" видано " + user + ".");
    }

    public void returnResource(String user) {
        LibraryResource resource = issuedResources.remove(user);
        if (resource != null) {
            System.out.println(resource.getType() + " \"" + resource.getTitle() + "\" повернуто " + user + ".");
        } else {
            System.out.println("Не знайдено ресурс для " + user + ".");
        }
    }
}
