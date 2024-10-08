package galaxy.domain.service.reservation;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class MakeTimeList{
	
	public List<String> makeHourList(){
	    // 時間リストを「時間」リストと「分」リストに分割
	    List<String> hourList = Stream.iterate(LocalTime.of(0, 0), t -> t.plusHours(1))
	            .limit(24)
	            .map(t -> String.format("%02d", t.getHour()))
	            .collect(Collectors.toList());
	    return hourList;
	}
	
	public List<String> makeMinuteList(){
	    // 時間リストを「時間」リストと「分」リストに分割
	    List<String> minuteList = Stream.iterate(0, n -> n + 5)
	            .limit(12)
	            .map(n -> String.format("%02d", n))
	            .collect(Collectors.toList());
	    return minuteList;
	}
}
