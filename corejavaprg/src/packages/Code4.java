package packages;

public class Code4 {
	int serialnumber;
	String name;
	int age;
	void show() {
		System.out.println(serialnumber +"  "+name+"  "+age);
		}
	public static void main(String[]arg) {
		Code4 c=new Code4();
		c.serialnumber=9;
		c.name="ramesh";
		c.age=50;
		c.show();
		
	}


}
