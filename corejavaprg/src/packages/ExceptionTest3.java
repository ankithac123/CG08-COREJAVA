package packages;

public class ExceptionTest3 {
public static void main(String[] args) {
        try {
                System.out.println(7/0);
        }
        catch(ArithmeticException n) {
                System.out.println(n.getMessage());
        }
        finally {
                System.out.println("am a king");
        }
}
}
