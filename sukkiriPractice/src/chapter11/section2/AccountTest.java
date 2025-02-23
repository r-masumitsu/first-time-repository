package chapter11.section2;

public class AccountTest {

	public static void main(String[] args) {
		testInstantiate();
		testTransfer();
	}
	
	//実際にAccountをnewして使ってみるテスト
	private static void testInstantiate() {
		System.out.println("Accountをnewできるかテストします");
		Account account = new Account("ミナト", 30000);
		if(!"ミナト".equals(account.getOwner())) {
			System.out.println("失敗！　名義人がおかしい");
		}
		if(30000 != account.getZandaka()) {
			System.out.println("失敗！　残高がおかしい");
		}
		System.out.println("Accountのテストを終了します");
	}
	
	//メソッドtransferのテスト（オリジナル）
	private static void testTransfer() {
		System.out.println("メソッドtransferをテストします");
		Account accountA = new Account("ミナト", 30000);
		Account accountB = new Account("アサカ", 70000);
		
		accountA.transfer(accountB, 2000);
		
		if(accountA.getZandaka() != 28000) {
			System.out.println("失敗！　送金元の残高がおかしい");
		}
		if(accountB.getZandaka() != 72000) {
			System.out.println("失敗！　送金先の残高がおかしい");
		}
		System.out.println("メソッドtransferのテストを終了します");
	}
}
