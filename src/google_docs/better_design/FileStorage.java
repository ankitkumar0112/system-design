package google_docs.better_design;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileStorage implements Persistence {

    @Override
    public void save(String path) {
        try {
            Files.writeString(Path.of("output.txt"), path, StandardOpenOption.APPEND);
        } catch (IOException exception) {
            throw new RuntimeException(exception.getMessage());
        }
    }
}
