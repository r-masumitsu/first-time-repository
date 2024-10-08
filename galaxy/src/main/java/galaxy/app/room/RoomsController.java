package galaxy.app.room;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import galaxy.domain.model.ReservableRoom;
import galaxy.domain.service.room.RoomService;

@Controller
@RequestMapping("rooms")
public class RoomsController {
	
	@Autowired
	RoomService roomService;
	
	@GetMapping
	String listRooms(Model model) {
		LocalDate today = LocalDate.now();
		model.addAttribute("date", today);
		return listRooms(today, model);
	}
	
	@GetMapping("{date}")
	String listRooms(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @PathVariable("date") LocalDate date,
			Model model) {
		List<ReservableRoom> rooms = roomService.findReservableRooms(date);
		model.addAttribute("rooms", rooms);
		return "room/listRooms";
	}
	
	@GetMapping("/select")
	String selectListRooms(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
			Model model) {
		List<ReservableRoom> rooms;
		try {
	    	rooms = roomService.findReservableRooms(date);
	    }catch(IllegalArgumentException e) {
    		model.addAttribute("message", e.getMessage());
    		return listRooms(model);
	    }
	    model.addAttribute("rooms", rooms);
	    model.addAttribute("date", date);
	    return "room/listRooms";
	}
}