package lab4;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    public void print(){
        System.out.println(text);
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
