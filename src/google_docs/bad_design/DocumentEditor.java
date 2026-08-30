package google_docs.bad_design;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {

    private List<String> elements;

    public DocumentEditor() {
        this.elements = new ArrayList<>();
    }

    public void addImage(String path) {
        elements.add(path);
    }

    public void addText(String text) {
        elements.add(text);
    }

    public String render() {
        if (elements.isEmpty()) {
            throw new RuntimeException("Elements are empty");
        } else {
            StringBuilder result = new StringBuilder();
            elements.forEach(el -> {
                if (el.length() > 4 && el.substring(el.length() - 4).equals(".jpeg")) {
                    result.append(el).append(".jpeg").append("\n");
                } else {
                    result.append(el).append("\n");
                }
            });
            elements = new ArrayList<>();
            System.out.println("Document rendered successfully");
            return result.toString();
        }
    }

    public void saveToFile(String renderedDocument) {
        try {
            Files.writeString(Path.of("output.txt"), renderedDocument, StandardOpenOption.APPEND);
            System.out.println("Document saved to file successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveToDb(String path) {
        System.out.println("Save to database successfully");
    }

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.addText("HP Laptop");
        documentEditor.addImage("Image.jpeg");
        documentEditor.saveToFile(documentEditor.render());
    }
}
