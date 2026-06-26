package packages;

public class Nestedinterface implements Demoo.MyInnerInterface {

    @Override
    public void print() {
            System.out.println("welcome to java");
           
    }
    public static void main(String[] args) {
            Nestedinterface n=new Nestedinterface();
            n.print();
         
            System.out.println(Demoo.MyInnerInterface.id);
    }

    

}