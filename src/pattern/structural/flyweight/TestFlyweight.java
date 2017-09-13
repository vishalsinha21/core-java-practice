package pattern.structural.flyweight;

public class TestFlyweight {

    public static void main(String[] args) {
        Image image1 = ImageFactory.getImage(ImageType.HORSE);
        Image image2 = ImageFactory.getImage(ImageType.DOG);
        Image image3 = ImageFactory.getImage(ImageType.CAT);
        Image image4 = ImageFactory.getImage(ImageType.HORSE);
        Image image5 = ImageFactory.getImage(ImageType.DOG);
        Image image6 = ImageFactory.getImage(ImageType.CAT);

        image1.draw(5, 10);
        image2.draw(10, 10);
        image3.draw(15, 10);
        image4.draw(3, 6);
        image5.draw(7, 14);
        image6.draw(1, 2);

    }
}
