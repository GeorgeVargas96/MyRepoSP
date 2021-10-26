package lab5;

public class ImageLoaderFactory {
    public ImageLoader create(String type)
    {
        if(type.equals("BMP"))
            return new BMPImageLoader();
        else return new JPGImageLoader();
    }
}
