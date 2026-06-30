package packages;

public class ExceptionTest2 {
//without exception

      public static void main(String[] args) {
              try {
                      System.out.println("hello my dear students");
              }
              catch(Exception c) {
                      System.out.println(c.getMessage());
              }
              finally {
                      System.out.println("hello goodmorning");
              }
      }

}
