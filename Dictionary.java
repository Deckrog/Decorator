import java.util.*;

public class Dictionary {
    public static ArrayList<String> accesses = new ArrayList<String>(
            Arrays.asList("protected", "private", "public"));
    public static ArrayList<String> clandint = new ArrayList<String>(
            Arrays.asList("interface", "class","implements"));
    public static ArrayList<String> primitives = new ArrayList<String>(
            Arrays.asList("byte","short","long","float","int","double","boolean","char"));
    public static ArrayList<String> objTypes = new ArrayList<String>(
            Arrays.asList("String","Integer","ArrayList"));
    public static ArrayList<String> hpWords = new ArrayList<String>(
            Arrays.asList("return","static","void","new","if"));
    public static void printWord(String s){
        if(accesses.contains(s)){
            IDecorator d =new BDecorator(new ItalicDecorator(new ColorDecorator(new DivDecorator(s),"green")));
            d.print();
            return;
        }
        if(clandint.contains(s)){
            IDecorator d = new SizeDecorator(new BDecorator(new ColorDecorator(new DivDecorator(s),"red")), "5");
            d.print();
            return;
        }
        if(primitives.contains(s)){
            IDecorator d = new BDecorator(new ColorDecorator(new DivDecorator(s),"yellow"));
            d.print();
            return;
        }
        if(objTypes.contains(s)) {
            IDecorator d = new ItalicDecorator(new BDecorator(new ColorDecorator(new DivDecorator(s), "purple")));
            d.print();
            return;
        }
        if(hpWords.contains(s)){
            IDecorator d =new BDecorator(new ItalicDecorator(new ColorDecorator(new DivDecorator(s),"blue")));
            d.print();
            return;
        }

        System.out.print(s);

    }
}