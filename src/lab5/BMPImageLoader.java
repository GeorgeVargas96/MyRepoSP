package lab5;

public class BMPImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String s) {
        System.out.println("Creating BMP Image");
        return new ImageContent(s);
    }
}
