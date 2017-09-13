package pattern.structural.flyweight;

import static java.lang.String.format;

public class DogImage implements Image {

    private String image = "Dog";

    public DogImage() {
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(format("object id: %s | drawing image %s at (%d,%d)", this.hashCode(), image, x, y));
    }

}
