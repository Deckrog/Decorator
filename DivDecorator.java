public class DivDecorator implements IDecorator{
    String s;
    public DivDecorator(String s){
        this.s=s;
    }
    public void print(){
        System.out.print(s);
    }
}