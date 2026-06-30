package packages;

import java.io.FileReader;
import java.io.IOException;

// demo for throws keyword
public class Throwdemo1 {

static void test() throws IOException,ClassNotFoundException{
        FileReader file=new FileReader("abc.txt");//may throw io exception
        Class.forName("Test");
        
        file.close();
}
public static void main(String[] args) {
        try {
                Throwdemo1.test();
        }
        catch(IOException e) {
                System.out.println("file error");
        }
        catch(ClassNotFoundException f) {
                System.out.println("class not found");
        }
}
}
