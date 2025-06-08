package chapter8.question3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//実行時までアノテーションに関する情報を保持する
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	String name();
	int price();
}
