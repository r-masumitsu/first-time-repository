package chapter8.question4;

public class Sample{
	@NotNull(message = "name is not allowed null")
	private String name;

	public Sample(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
