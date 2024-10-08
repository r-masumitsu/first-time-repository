package problem6;
 
public class Minmax {
    //  最大値の取得
    public int max(int n1,int n2, int n3){
    	int values[] = {n1, n2, n3};
    	int max = values[0];
        for (int index = 1; index < values.length; index ++) {//[3]
            max = Math.max(max, values[index]);//[4]
        }
        return max;
    }
    //  最小値の取得
    public int min(int n1,int n2, int n3){
    	int values[] = {n1, n2, n3};
    	int min = values[0];
        for (int index = 1; index < values.length; index ++) {//[3]
            min = Math.min(min, values[index]);//[4]
        }
        return min;
    }
 
}