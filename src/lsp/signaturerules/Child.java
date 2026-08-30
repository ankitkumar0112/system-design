package lsp.signaturerules;

public class Child implements Parent {
    @Override
    public String getName(String name) {
        System.out.println("Name");
        return name;
    }
}
