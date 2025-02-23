package chapter7.section4;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

//XMLファイルを読み取って表示するプログラム
public class XmlMain {

	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("/Applications/Eclipse_2023-12.app/Contents/workspace/sukkiriPractice/resources/rpgsave.xml");) {
			//①文書全体（Document）を取得
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
			//②一番外側のheroタグ（Element）を取得
			Element hero = doc.getDocumentElement();
			//③その中のweaponタグ（Element）を取得
			Element weapon = findChildByTag(hero, "weapon");
			//④その中のpowerタグ（Element）を取得
			Element power = findChildByTag(weapon, "power");
			//その中の文字列情報（Text）を取得
			String value = power.getTextContent();
			//コンソールに表示
			System.out.println(value);
		} catch (Exception e) {
			System.out.println("例外が発生しました");
			e.printStackTrace();
		}
	}

	//指定された名前を持つタグの最初の子タグを返す静的メソッド
	static Element findChildByTag(Element self, String name) throws Exception {
		NodeList children = self.getChildNodes();
		for(int i = 0; i < children.getLength(); i++) {
			if(children.item(i) instanceof Element) {
				Element e = (Element)children.item(i); 
				if(e.getTagName().equals(name)) {
					return e;
				}
				
			}
		}
		return null;
	}

}
