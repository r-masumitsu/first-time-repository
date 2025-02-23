package chapter4.section7.subsection3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RefMain {

	public static void main(String[] args) throws Exception{
		Class<?> clazz = RefSample.class;
		//引数１つのコンストラクタを取得し、インスタンスを生成する
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample)cons.newInstance(256);
		//timesフィールドに関するFieldを取得して読み書き
		Field f = clazz.getField("times");
		System.out.println("フィールド変更前" + f.get(rs));	//rsのtimesを取得（フィールド変更前）
		f.set(rs, 2);	//rsのtimesに代入
		System.out.println("フィールド変更後" + f.get(rs));		//rsのtimesを取得（フィールド変更後）
		
		//引数２つのhelloメソッドを取得して呼び出す
		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs, "reflection!", 128);
		//クラスやメソッドへの修飾（publicやfinalの有無）を調べる
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
		System.out.println("クラスの修飾子はpublic？" + (pubc? "はい" : "いいえ"));
		System.out.println("メソッドの修飾子はfinal？" + (finm? "はい" : "いいえ"));
	}

}
