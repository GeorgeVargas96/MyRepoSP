package lab5;

public class JPGImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String s) {
        System.out.println("Creating JPG Image");
        return new ImageContent(s);
    }
}
