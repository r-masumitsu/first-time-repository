package chapter7.section5;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//JsonNodeを利用してhero.jsonを読み取る
public class JsonNodeMain {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(
				new File("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/hero.json"));
		JsonNode hero = root.get("hero");
		JsonNode weapon = hero.get("weapon");
		System.out.println("名前：" + hero.get("name").textValue());
		System.out.println("武器：" + weapon.get("name").textValue());
	}

}
