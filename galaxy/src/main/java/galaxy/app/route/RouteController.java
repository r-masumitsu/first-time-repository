package galaxy.app.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @GetMapping
    public String redirectToRooms() {
        return "redirect:/rooms";
    }
}