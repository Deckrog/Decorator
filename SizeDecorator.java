public class SizeDecorator implements  IDecorator{
    IDecorator d;
    String size;
    public SizeDecorator(IDecorator d, String size){
        this.d=d;
        this.size=size;
    }
    public void print(){
        System.out.print("<font size="+size+">");
        d.print();
        System.out.print("</font>");
    }
}
