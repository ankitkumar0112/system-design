package google_docs.better_design;

public class DocumentEditor {
    Document document;
    Persistence persistence;
    String renderedDocument;

    public DocumentEditor(Document document, Persistence persistence) {
        this.document = document;
        this.persistence = persistence;
    }

    public void addText(TextElement element) {
        document.addElement(element);
    }

    public void addImage(ImageElement element) {
        document.addElement(element);
    }

    public String render() {
        renderedDocument = document.render();
        return renderedDocument;
    }

    public void save(String path) {
        persistence.save(path);
    }

    public static void main(String[] args) {
        Document document = new Document();
        Persistence persistence = new FileStorage();
        DocumentEditor editor = new DocumentEditor(document, persistence);
        editor.addText(new TextElement("Hello World!"));
        editor.addImage(new ImageElement("hello.jpeg"));
        String render = editor.render();
        editor.save(render);
    }

}
