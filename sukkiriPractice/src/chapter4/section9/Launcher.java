package chapter4.section9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Launcher {
	
	//リフレクションでmainメソッドを呼び出すメソッド
	private static int bootReflection(Class<?> cinfo) throws Exception{
		//メソッドを取得して呼び出す
		Method method = cinfo.getMethod("main", String[].class);
		String args[] = {};
		try {
			method.invoke(null, (Object)args);
			return 0;
		}catch(Exception e) {
			return 1;
		}
	}
	
	public static void main(String[] args) throws Exception{
		//プログラムの終了コードを設定
		int rtnCode = 2;
		
		//コマンドライン引数から、起動すべきクラスのFQCN（第１引数）と、起動方法を示す文字（EまたはI）（第２引数）を受け取る
		String args1 = args[0];
		String args2 = args[1];
		
		//現在のメモリ使用量（MB単位）を表示する
		long freeMemory = Runtime.getRuntime().freeMemory();
		long totalMemory = Runtime.getRuntime().totalMemory();
		System.out.println("現在のメモリ使用料：" + (totalMemory - freeMemory)  /1024 /1024 + "MB");
		
		//FQCNのクラスが持つ、全てのメソッド名を画面に表示する
		Class<?> cinfo = Class.forName(args1);
		Method[] methods = cinfo.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("全てのメソッド名：" + method);
		}
		
		//指定された方法によって起動する
		//Eの場合、ProcessBuilderで別プロセスとして起動する
		//Iの場合、リフレクションでmainメソッドを呼び出す
		if(args2.equals("E")) {
	        ProcessBuilder pb = new ProcessBuilder(
	        		"java", "-cp", System.getProperty("java.class.path"), args1
	        );
	        Process proc = pb.start();
	        
            // 標準出力を読み取る
            BufferedReader outputReader = new BufferedReader(
                new InputStreamReader(proc.getInputStream())
            );
            String line;
            while ((line = outputReader.readLine()) != null) {
                System.out.println(line);
            }

            // 標準エラーを読み取る
            BufferedReader errorReader = new BufferedReader(
                new InputStreamReader(proc.getErrorStream())
            );
            while ((line = errorReader.readLine()) != null) {
                System.err.println(line);
            }
	        
	        rtnCode = proc.waitFor();
	        
		}else if(args2.equals("I")) {
			rtnCode = bootReflection(cinfo);
		}else {
			System.out.println("起動方法が指定されませんでした");
			System.out.println("指定された起動方法：" + args2);
		}
		
		//現在のメモリ使用量（MB単位）を表示する
		freeMemory = Runtime.getRuntime().freeMemory();
		totalMemory = Runtime.getRuntime().totalMemory();
		System.out.println("現在のメモリ使用料：" + (totalMemory - freeMemory) /1024 /1024 + "MB");
		
		//このプログラムが終了する際には、起動に成功した場合は0、そうでなければ1を終了コードとする
		System.out.println("終了コード：" + rtnCode);
		
	}
	
}
