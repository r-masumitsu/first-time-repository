package problemex5;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Problemex5_4 {
 
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //文字列を格納する可変長配列
        ArrayList<String> arrayList = new ArrayList<>();
        
        while(true) {
            System.out.print("文字列を入力：");
            //  コンソールから文字列の読み込み
            String buf = br.readLine();
            //可変長配列に追加
            arrayList.add(buf);
            //何も入力されない場合繰り返し処理を抜ける
            if(buf.equals("")) {
            	break;
            }
        }
        
        //可変長配列に格納された値を全て出力
        for(String str : arrayList) {
        	System.out.print(str  + " ");
        }
    }
}