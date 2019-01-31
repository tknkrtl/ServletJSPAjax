package ajaxjson;

public class Information {

	private String Name;
	private String LastName;
	private int Age;
	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Information(String name, String lastName, int age) {
		super();
		Name = name;
		LastName = lastName;
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	
}
