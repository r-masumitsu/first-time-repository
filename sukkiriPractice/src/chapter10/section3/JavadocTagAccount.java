package chapter10.section3;

/**
 * 口座クラス
 * @author 湊
 * @deprecated 代わりにNewAccountクラスを利用してください。
 * @see NewAccount
 */
public class JavadocTagAccount implements java.io.Serializable{
	/**
	 * 他行への振り込みを行うメソッド。
	 * @param bank 送金先銀行
	 * @param dest 送金先口座
	 * @param amount 送金する金額
	 * @return 送金手数料
	 * @exception java.lang.IllegalArgumentException 残高不足のとき
	 */
	public int transfer(Bank bank, Account dest, int amount) {
		return 100;
	}
}
