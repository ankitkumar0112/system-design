package google_docs.better_design;

import java.util.ArrayList;
import java.util.List;

public class Document {
    List<DocumentElement> elements;

    public Document() {
        this.elements = new ArrayList<>();
    }

    void addElement(DocumentElement element) {
        elements.add(element);
    }

    String render() {
        StringBuilder result = new StringBuilder();
        for (DocumentElement element : elements) {
            result.append(element.render());
        }
        return result.toString();
    }
}
