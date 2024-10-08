package galaxy.domain.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;

import galaxy.domain.model.MeetingRoom;

public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Integer> {
}