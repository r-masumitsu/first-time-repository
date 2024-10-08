package used;

/**
* Calculator実装クラス<br>
* 加算を行う
*/
public class AddCalc implements Calculator {
	@Override
	public Integer calc(Integer x, Integer y) {
		return x + y;
	}
}