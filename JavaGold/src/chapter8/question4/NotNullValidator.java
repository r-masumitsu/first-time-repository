package chapter8.question4;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NotNullValidator {

	public static List<String> validate(Object target) {
		try {
			List<String> messages = new ArrayList<String>();
			
			//クラスリテラルを取得
			Class<?> clazz = target.getClass();
			
			//フィールド定義情報の一覧を取得
			Field[] fields = clazz.getDeclaredFields();
			
			for(Field field : fields) {
				//フィールドのアクセス情報を変更
				field.setAccessible(true);
				
				/*
				 * アノテーションを取得
				 * もし指定したアノテーション（Testアノテーション）がなければnullを返す
				 */
				NotNull annotation = field.getAnnotation(NotNull.class);
				
				if(annotation == null) {
					continue;
				}
				
				if(field.get(target) != null) {
					continue;
				}
				messages.add(annotation.message());
			}
			return messages;
		} catch ( IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException();
		}
	}

}
