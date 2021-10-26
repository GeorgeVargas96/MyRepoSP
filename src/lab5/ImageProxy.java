package lab5;

public class ImageProxy implements Element, Picture {
   String url;
   Dimension dim;
   Image realImage;

    public ImageProxy(String url) {
        Image realImage =new Image(url);
    }

    @Override
    public void print() {
        this.loadImage();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }
    Image loadImage()
    {
        if(realImage==null)
        {
            realImage=new Image(url);
        }
        return realImage;
    }
    @Override
    public Image content() {
        return null;
    }
}
