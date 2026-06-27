package packages;

public class Ignorecase {
//demo for equal ignore case

       public static void main(String[] args) {
               String s1="sushma";
               String s2="SUSHMA";
               System.out.println(s1.equalsIgnoreCase(s2));
               System.out.println(s1.equals(s2));
       }

}