public class BDecorator implements IDecorator {
    IDecorator d;
    public BDecorator(IDecorator d){
        this.d=d;
    }
    public void print(){
        System.out.print("<b>");
        d.print();
        System.out.print("</b>");
    }
}

