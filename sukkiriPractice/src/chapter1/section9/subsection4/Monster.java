package chapter1.section9.subsection4;

public record Monster(String name, int hp, boolean isBoss) {
	public Monster{
		if(hp < 0) {
			throw new IllegalArgumentException();
		}
	}
}
