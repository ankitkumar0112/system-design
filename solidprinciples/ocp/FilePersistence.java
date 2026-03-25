package solidprinciples.ocp;

public class FilePersistence implements Persistence {
    @Override
    public void save() {
        System.out.println("Saved to file successful");
    }
}
