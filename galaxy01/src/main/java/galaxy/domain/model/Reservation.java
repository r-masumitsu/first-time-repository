package galaxy.domain.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Reservation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservationId;
		
	private LocalTime startTime;
	
	private LocalTime endTime;
	
	private String comment;
	
	private boolean online;
	
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "reserved_date"), @JoinColumn(name = "room_id") })
	private ReservableRoom reservableRoom;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public boolean overlap(Reservation target) {
		if (!Objects.equals(reservableRoom.getReservableRoomId(), target.reservableRoom.getReservableRoomId())) {
			return false;
		}
		if (startTime.equals(target.startTime) && endTime.equals(target.endTime)) {
			return true;
		}
		return target.endTime.isAfter(startTime) && endTime.isAfter(target.startTime);
	}
	
	// startTimeから時間部分（"HH"）を文字列で取得
	public String getCreateStartHour() {
		return String.format("%02d", startTime.getHour());
	}

	// startTimeから分部分（"mm"）を文字列で取得
	public String getCreateStartMinute() {
		return String.format("%02d", startTime.getMinute());
	}

	// endTimeから時間部分（"HH"）を文字列で取得
	public String getCreateEndHour() {
		return String.format("%02d", endTime.getHour());
	}

	// endTimeから分部分（"mm"）を文字列で取得
	public String getCreateEndMinute() {
		return String.format("%02d", endTime.getMinute());
	}
}