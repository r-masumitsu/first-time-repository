package chapter8.section6;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MiyabiLink {

	public static void main(String[] args) {
		//HttpClientインスタンスを生成する
		//各種の設定メソッドを連鎖的に呼び出していき、最後にbuild()を呼ぶという特有の手順を踏む
		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP_1_1)	//HTTP1.1を使用
				.followRedirects(Redirect.NORMAL)	//30X応答で転送先に自動訪問
				.build();
		//HttpRequestインスタンスを生成する
		//各種の設定メソッドを連鎖的に呼び出していき、最後にbuild()を呼ぶという特有の手順を踏む
		//URIは「https://docs.github.com/ja/rest/reference」から調べた
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://api.github.com/users/miyabilink"))
				.GET()
				.build();
		//リクエストの実行とHttpResponseの取得		
		try {
			HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());	//同期方式でリクエスト
			String body = response.body();
			int status = response.statusCode();
			if(status == 200) {
				ObjectMapper mapper = new ObjectMapper();
				JsonNode root = mapper.readTree(body);
				String blog = root.get("blog").textValue();
				System.out.println(blog);
			}else {
				System.out.println("ERROR: " + status);
			}
				
		} catch (InterruptedException e) {
			System.out.println("割込の例外が発生しました");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("入出力の例外が発生しました");
			e.printStackTrace();
		}
	}

}
