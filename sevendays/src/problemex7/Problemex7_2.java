package problemex7;
 
public class Problemex7_2 {
 
    public static void main(String[] args) {
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
            	//初期化
            	int answer = 0;
            	
            	try {
            		answer = i/j;
            	}catch(ArithmeticException e) {
            		System.out.println("0で割り算はできません。");
            		continue; //0で割り算ができない時は、標準出力しないので、次のループに移る
            	}
                
            	System.out.print(i + "/ " + j + " = " + answer + " ");
            	
            }
            System.out.println();
        }
    }
}