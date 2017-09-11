package pattern.structural.composite;

import com.sun.deploy.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Directory implements AbstractFile {

    private String name;
    private List<AbstractFile> files;

    public Directory(String name) {
        this.name = name;
    }

    public Directory(String name, List<AbstractFile> files) {
        this.name = name;
        this.files = files;
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String ls() {
        List<String> filesStr = this.files.stream().map(file -> file.ls()).collect(Collectors.toList());
        return name + "\n" + StringUtils.join(filesStr, "\n");
    }
}
