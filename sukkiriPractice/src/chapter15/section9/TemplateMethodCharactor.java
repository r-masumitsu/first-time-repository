package chapter15.section9;

public abstract class TemplateMethodCharactor {
	protected String name;

	//処理の大まかな流れだけを決めるfinalなメソッド
	public final void introduce() {
		System.out.println("私の名前は、" + this.name + "です。");
		doIntroduce(); //抽象メソッドを呼び出し
		System.out.println("よろしくお願いします。");
	}

	//処理の詳細部だけを記述するprotected abstractなメソッド
	protected abstract void doIntroduce();
}
