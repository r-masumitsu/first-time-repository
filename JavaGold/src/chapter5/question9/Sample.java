package chapter5.question9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception{
		List<PostalCode> list = createList("utf_add_2504.csv");
		list.forEach(System.out::println);
	}
	
	private static List<PostalCode> createList(String file) throws FileNotFoundException{
		List<PostalCode> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream(file);
		Scanner scanner = new Scanner(fis);
		scanner.useDelimiter(",|\n");
		
		try(scanner){
			//hasNext()で次に読み込むべき要素があるかどうかを確認
			while(scanner.hasNext()) {
				// skip 全国地方公共団体コード
				scanner.next();	//next()で次の要素を読み込み
				// skip 郵便番号（5桁）
				scanner.next();
				// skip 郵便番号（7桁）
				String code = scanner.next().replaceAll("\"", ""); 
				// skip 都道府県名 半角カタカナ
				scanner.next();
				// skip 市区町村 半角カタカナ
				scanner.next();
				// skip 町域名 半角カタカナ
				scanner.next();
				// skip 都道府県名
				String pref = scanner.next().replaceAll("\"", ""); 
				// skip 市区町村
				String dist = scanner.next().replaceAll("\"", "");
				// skip 町域名
				String town = scanner.next().replaceAll("\"", "");
				
				//必要な情報のみのリストを作成
				list.add(new PostalCode(code, pref, dist, town));
			}
		}
		return list;
	}
}
