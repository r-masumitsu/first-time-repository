package chapter1.question16;

public enum Sample {
	A("hello A"),B("hello B"), C("hello C");

	private final String value;

	private Sample(String value) {
		System.out.println(value);
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
