package pattern.structural.composite;

public class File implements AbstractFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String ls() {
        return name;
    }
}
