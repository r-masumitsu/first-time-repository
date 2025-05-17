package chapter4.question15;

public class Value {
	private String data;
	public Value(String data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		return 100;
	}
	@Override
	public boolean  equals(Object obj) {
		return true;
	}
	
	//警告を消すために追加
	public String getter() {
		return data;
	}
}
