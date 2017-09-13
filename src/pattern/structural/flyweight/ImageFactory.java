package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {

    private static Map<ImageType, Image> imageMap = new HashMap<>();

    public static Image getImage(ImageType imageType) {
        Image image = imageMap.get(imageType);

        if (image == null) {
            if (imageType == ImageType.HORSE) {
                image = new HorseImage();
                imageMap.put(ImageType.HORSE, image);
            } else if (imageType == ImageType.DOG) {
                image = new DogImage();
                imageMap.put(ImageType.DOG, image);
            } else if (imageType == ImageType.CAT) {
                image = new CatImage();
                imageMap.put(ImageType.CAT, image);
            }
        }

        return image;
    }
}
