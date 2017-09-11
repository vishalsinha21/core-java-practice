package pattern.structural.composite;

import static java.util.Arrays.asList;

public class TestComposite {

    public static void main(String[] args) {

        File file1 = new File("song1");
        File file2 = new File("song2");
        File file3 = new File("song3");
        Directory music = new Directory("music", asList(file1, file2, file3));

        File pic5 = new File("pic5");
        File pic6 = new File("pic6");
        Directory album = new Directory("album", asList(pic5, pic6));

        File pic1 = new File("pic1");
        File pic2 = new File("pic2");
        File pic3 = new File("pic3");
        Directory pictures = new Directory("pictures", asList(pic1, pic2, pic3, album));

        Directory root = new Directory("root", asList(music, pictures));

        System.out.println(root.ls());
    }
}
