package mrs.domain.repository.reservation;

import java.util.List;

import mrs.domain.model.ReservableRoomId;
import mrs.domain.model.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

// 14.2.7.1. リポジトリクラスの作成 ReservationRepository.java
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	List<Reservation> findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(ReservableRoomId reservableRoomId);
}