package packages;

public class Student4 {

// demo for static method


        int rollno;
        String name;
         static String College="Reva";
        
        //static method change value
        
        static void Change() {
                //name="rashmi";
                College="vkit";
        }
        Student4(int r, String n){
                rollno=r;
                name=n;
        }
        void display() {
                System.out.println(rollno +" "+name+" "+College);
        }
        public static void main(String[] args) {
                Student4.Change();
                Student4  s1=new Student4 (1,"rashmi");
                Student4  s2=new Student4 (2,"sushma");
                Student4  s3=new Student4 (3,"mamatha");
                Student4  s4=new Student4 (4,"rohith");
                
                s1.display();
                s2.display();
                s3.display();
                s4.display();
                
        }
}
