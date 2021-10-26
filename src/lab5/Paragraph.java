package lab5;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }
    public void print(){

        if(alignStrategy!=null)
            alignStrategy.render(this, new Context());
        else {
            System.out.println(text);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
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

    public String getText() {
        return text;
    }
}
