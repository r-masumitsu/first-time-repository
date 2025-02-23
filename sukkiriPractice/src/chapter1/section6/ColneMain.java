package chapter1.section6;

public class ColneMain {

	public static void main(String[] args) {
		Sword sword = new Sword("はがねの剣");
		Hero hero1 = new Hero("ミナト", 100, sword);
		
		Hero hero2 = hero1.clone();
		
		hero1.getSword().setName("ひのきの剣");
		hero1.setName("アサカ");
		
		System.out.print("コピー元の剣：");
		System.out.println(hero1.getSword().getName());
		System.out.print("コピー元の名前：");
		System.out.println(hero1.getName());
		
		System.out.print("コピー先の剣：");
		System.out.println(hero2.getSword().getName());
		System.out.print("コピー先の名前：");
		System.out.println(hero2.getName());
	}

}
