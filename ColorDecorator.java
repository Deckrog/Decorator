public class ColorDecorator implements IDecorator{
    IDecorator d;
    String color;
    public ColorDecorator(IDecorator d, String color){
        this.d=d;
        this.color=color;
    }
    public void print(){
        System.out.print("<font color="+color+">");
        d.print();
        System.out.print("</font>");
    }
}
