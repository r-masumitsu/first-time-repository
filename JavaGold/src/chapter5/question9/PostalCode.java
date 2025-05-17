package chapter5.question9;

public class PostalCode {
	private String code;
	private String prefecture;
	private String distinct;
	private String town;
	
	public PostalCode(String code, String prefecture, String distinct, String town) {
		super();
		this.code = code;
		this.prefecture = prefecture;
		this.distinct = distinct;
		this.town = town;
	}
	
	@Override
	public String toString() {
		return code + " " + prefecture + distinct + town;
	}
}
