package packages;

public class Code5 {
	public int id;
	private String name;
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		}
	public static void main(String []arg) {
		Code5 c1=new Code5();
		c1.setId(101);
		c1.setName("hema");
		
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		
	}
 
}
