package google_docs.better_design;

public class ImageElement implements DocumentElement {

    private final String imagePath;

    public ImageElement(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String render() {
        StringBuilder result = new StringBuilder();
        if (imagePath.length() > 4 && imagePath.endsWith(".jpeg")) {
            result.append(imagePath).append("\n");
        }
        return result.toString();
    }
}
