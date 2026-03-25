package solidprinciples.ocp;

public class DbPersistence implements Persistence {

    @Override
    public void save() {
        System.out.println("Saved to database successful");
    }
}
