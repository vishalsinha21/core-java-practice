package effective.java.creation.static_factory.compliant;

public class Color {

    int hex;

    private Color(int hex) {
        this.hex = hex;
    }

    public static Color makeFromPalette(int red, int green, int blue) {
        return new Color(red + green + blue);
    }

    public static Color makeFromRGB(int rgb) {
        return new Color(rgb * 16);
    }

    public static Color makeFromHex(int hex) {
        return new Color(hex);
    }

}
