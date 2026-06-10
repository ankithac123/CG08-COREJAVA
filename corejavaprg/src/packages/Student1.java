package packages;
// demo for static method

public class Student1 {
        int rollno;
        String name;
         static String College="Reva";
        
        //static method change value
        
        static void Change() {
                //name="rashmi";
                College="vkit";
        }
        Student1(int r,String n){
                rollno=r;
                name=n;
        }
        void display() {
                System.out.println(rollno +" "+name+" "+College);
        }
        public static void main(String[] args) {
                Student1.Change();
                Student1  s1=new Student1 (1,"rashmi");
                Student1  s2=new Student1 (2,"sushma");
                Student1  s3=new Student1 (3,"mamatha");
                Student1  s4=new Student1 (4,"rohith");
                
                s1.display();
                s2.display();
                s3.display();
                s4.display();
                
        }
}

