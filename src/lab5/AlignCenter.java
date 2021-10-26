package lab5;

public class AlignCenter implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context c) {
        System.out.println("Paragraph" + paragraph.getText()+" align center");
    }
}
