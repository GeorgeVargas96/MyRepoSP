package lab4;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
            this.imageName = imageName;
        try
        {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println(imageName);
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
}
