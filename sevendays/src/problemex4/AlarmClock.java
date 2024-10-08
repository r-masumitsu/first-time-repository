package problemex4;
 
//  アラームつき時計クラス
public class AlarmClock implements IClock,IAlarm{
    public void setAlarm(){
        System.out.println("アラームをセットする");
    }
    public void alarm(){
        System.out.println("アラームを鳴らす");
    }
    public void stopAlarm(){
        System.out.println("アラームを止める");
    }
    public void adjustTime(){
        System.out.println("時刻を修正する");
    }
    public void showTime(){
        System.out.println("時刻を知る");
    }
 
}