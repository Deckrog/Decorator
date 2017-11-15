public class ItalicDecorator implements IDecorator{
    IDecorator d;
    public ItalicDecorator(IDecorator d){
        this.d=d;
    }
    public void print(){
        System.out.print("<i>");

        d.print();
        System.out.print("</i>");
    }
}
