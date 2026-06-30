package packages;
public class Throwdemo {
     static void withdraw(int balance,int amount) {
             if(amount>balance) {
                     throw new RuntimeException("Insufficient balance");
             }
             System.out.println("money withdraw successfully");
     }
     
     
     public static void main(String[] args) {
             Throwdemo.withdraw(10000, 5000);
     }

}
