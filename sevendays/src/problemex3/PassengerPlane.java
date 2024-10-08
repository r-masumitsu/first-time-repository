package problemex3;
 
//  戦闘機クラス
public class PassengerPlane extends AirPlane{
    // コンストラクタでフィールドを初期化
    public PassengerPlane() {
        type = "旅客機";
    }
    //  タイプの取得
    public String getType(){
        return type;
    }
    //  飛行する
    public void fly(){
        System.out.println("乗客を乗せて目的地まで飛行します。");
    }
    //  戦闘する
    public void carryPassengers(){
        System.out.println("乗客を目的地まで運びます。");
    }
}