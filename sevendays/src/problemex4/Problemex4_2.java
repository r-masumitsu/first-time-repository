package problemex4;
 
public class Problemex4_2 {
 
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        AlarmClock ac = new AlarmClock();   //  アラーム付き時計クラスのインスタンスを生成
        
        //メソッドの実行
        funcAlarm(ac);
        funcClock(ac);
    }
    
    //　メソッドを定義
    //  アラームとしての処理
    public static void funcAlarm(IAlarm alarm){
        alarm.setAlarm();   //  アラームのセット
        alarm.alarm();      //  アラームを鳴らす
        alarm.stopAlarm();  //  アラームを止める
    }
    //　メソッドを定義
    //  時計としての処理
    public static void funcClock(IClock clock){
        clock.adjustTime(); //  時間を調整する
        clock.showTime();   //  時間を表示する
    }
 
}