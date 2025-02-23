package chapter7.section5;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBindingMain {

	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonFileData file = mapper.readValue(
				new File("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/hero.json"),
				JsonFileData.class);
		System.out.println("名前：" + file.hero.name);
		System.out.println("武器：" + file.hero.weapon.name);
	}

}
