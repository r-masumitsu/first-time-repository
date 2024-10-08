package problemex3;
 
//  戦闘機クラス
public class FighterAiracraft extends AirPlane{
    // コンストラクタでフィールドを初期化
    public FighterAiracraft() {
        type = "旅客機";
    }
    //  タイプの取得
    public String getType(){
        return type;
    }
    //  飛行する
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }
    //  戦闘する
    public void fight(){
        System.out.println("戦闘します。");
    }
}