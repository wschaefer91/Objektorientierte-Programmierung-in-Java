public class Robot {

	private String name;
	private String id;
	private int age;

	Robot(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	@Override
	public String toString()
	{
	    return name + "_" + id + "_" + age;
	}
}
