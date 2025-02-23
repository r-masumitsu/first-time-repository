package chapter1.section6;

public class Sword implements Cloneable {
	private String name;

	public Sword(String name) {
		this.name = name;
	}
	
	public Sword clone() {
		Sword result = new Sword(this.name);
		return result;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
