package chapter4.question22;

import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
/*
 * ストリームを扱う際に、途中経過を保持するオブジェクトを使いたいときに、Collectorインタフェースを使う
 * 第一引数：ストリーム内の要素の型
 * 第二引数：処理途中の値を保持するためのオブジェクト
 * 第三引数：最終的な結果の型
 */
public class SampleCollector implements Collector<String, StringBuilder, String> {
	@Override //処理途中の値を保持するためのオブジェクトを生成するメソッド
	public Supplier<StringBuilder> supplier() {
		return StringBuilder::new;
	}

	@Override //具体的に実行したい処理を記述
	public BiConsumer<StringBuilder, String> accumulator() {
		return (builder, str) -> {
			if (builder.length() != 0) {
				builder.append(",");
			}
			builder.append(str);
		};
	}

	@Override	//並列処理をするときに、個々に作られた処理途中の値を保持するためのオブジェクトを結合する
	public BinaryOperator<StringBuilder> combiner() {
		return (a, b) -> {
			if (a.length() != 0) {
				a.append(",");
			}
			a.append(b);
			return a;
		};
	}

	@Override //処理結果を戻すラムダ式を提供するメソッド
	public Function<StringBuilder, String> finisher() {
		return builder -> builder.toString();
	}

	@Override //Collectorの特徴を表すEnumのセットを戻すメソッド
	public Set<Characteristics> characteristics() {
		return EnumSet.noneOf(Characteristics.class);
	}
}
