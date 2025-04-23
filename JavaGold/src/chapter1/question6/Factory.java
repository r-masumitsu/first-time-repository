package chapter1.question6;

public class Factory {
	public static Test hello() {
		class Hello implements Test{
			@Override
			public void execute() {
				System.out.println("hello.");
			}
		}
		return new Hello();
	}
	public static Test bye() {
		class Bye implements Test{
			@Override
			public void execute() {
				System.out.println("bye.");
			}
		}
		return new Bye();
	}
}
