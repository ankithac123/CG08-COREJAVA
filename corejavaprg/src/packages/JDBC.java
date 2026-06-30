package packages;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//demo for jdbc program
//step 1 : import the packages
public class JDBC {
        
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // step 2 : load and register the driver
         
         Class.forName("org.postgresql.Driver");
         System.out.println("step 2 load and driver done");
         
         //step 3: establish connection
         
         Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres" ,"postgres","Anki@8147");
         System.out.println("connection completed");
         
         //step 4: create statement
         
         Statement st=conn.createStatement();
         
         //step 5: execute the query
         
         String strselect="SELECT \"SID\",\"Sname\",semail,college FROM \"Student\" ";
         
         System.out.println("the sql statement is "+strselect);
         
         // process the result to display
         
         ResultSet rst=st.executeQuery(strselect);
         
         System.out.println("The records are :");
         int rowcount=0;
         while (rst.next()) {
                int SID=rst.getInt("SID");
                String Sname=rst.getString("Sname");
                String semail=rst.getString("semail");
                String college =rst.getString("college");
                
                System.out.println(SID+" "+Sname+" "+semail+""+college);
                ++rowcount;
         }
}
}