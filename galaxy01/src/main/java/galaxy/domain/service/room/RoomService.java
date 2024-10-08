package galaxy.domain.service.room;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import galaxy.domain.model.MeetingRoom;
import galaxy.domain.model.ReservableRoom;
import galaxy.domain.repository.room.MeetingRoomRepository;
import galaxy.domain.repository.room.ReservableRoomRepository;

@Service
@Transactional
public class RoomService {
	
	@Autowired
	ReservableRoomRepository reservableRoomRepository;
	
	@Autowired
	MeetingRoomRepository meetingRoomRepository;
	
	public List<ReservableRoom> findReservableRooms(LocalDate date) throws IllegalArgumentException{
		List<ReservableRoom> list = reservableRoomRepository.findByReservableRoomId_ReservedDateOrderByReservableRoomId_RoomIdAsc(date);
        if (list.isEmpty())  {
        	throw new IllegalArgumentException("その日付は選択できません。選びなおしてください。");
        }
        return list;
	}
	
	public MeetingRoom findMeetingRoom(Integer roomId) throws IllegalArgumentException{
		MeetingRoom meetingRoom = meetingRoomRepository.findById(roomId).orElse(null);
		if (meetingRoom == null) {
			throw new IllegalArgumentException("会議室が見つかりません。選びなおしてください。");
		}
		return meetingRoom;
	}
}