package chapter4.question24;

public class Department {
	private String name;
	public Department(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Department) {
			Department other = (Department)obj;
			return this.name.equals(other.name);
		}
		return false;
	}
}
