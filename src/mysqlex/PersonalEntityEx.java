package mysqlex;

public class PersonalEntityEx {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PersonalEntityEx [id=" + id + ", name=" + name + "]";
	}
	public PersonalEntityEx(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
