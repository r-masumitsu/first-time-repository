package chapter8.question4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)	//フィールドに付与するタイプに設定
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
	String message();
}
