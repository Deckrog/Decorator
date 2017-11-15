import java.io.*;
import java.util.Scanner;
public class Test {
    public static void printText(String code) {
        StringBuffer word = new StringBuffer();
        for (int i = 0; i < code.length(); i++) {
            if (((code.charAt(i) <= 122) && (code.charAt(i) >= 97)) || ((code.charAt(i) <= 90) && (code.charAt(i) >= 65)))
                word.append(code.charAt(i));
            else {
                Dictionary.printWord(word.toString());
                word.delete(0, word.length());
                if (code.codePointAt(i) == 13)
                    System.out.print("<br>");
                System.out.print(code.charAt(i));
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException {
        String code = "";
        System.out.println("Enter java file path and name");
        Scanner pathIn = new Scanner(System.in);
        String javaFilePath = pathIn.nextLine();
        Scanner javaFile = new Scanner(new File(javaFilePath));
        while (javaFile.hasNext())
            code += javaFile.nextLine() + "\r\n";
        javaFile.close();
        printText(code);
    }
}
