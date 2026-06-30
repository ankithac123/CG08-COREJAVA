package packages;
@FunctionalInterface
interface Cube{
     int calculate(int a);        
}

public class AdditionMain {
public static void main(String[] args) {
     Cube c=(a)->{return (a*a*a);};
     System.out.println("cube of a number :"+c.calculate(2));
}
}