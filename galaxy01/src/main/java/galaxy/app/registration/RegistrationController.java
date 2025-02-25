package galaxy.app.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import galaxy.domain.model.User;
import galaxy.domain.service.user.UserRegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	UserRegistrationService userRegistrationService;
	
	@ModelAttribute("registrationForm")
	RegistrationForm setUpForm() {
		return new RegistrationForm();
	}
	
    @GetMapping("registerForm")
    String registerForm() {
        return "registration/registerForm";
    }
    
    @PostMapping("register")
    String register(@Validated @ModelAttribute("registrationForm") RegistrationForm form,
            BindingResult bindingResult,
            User user,
            String confirmPassword, 
            Model model,
            RedirectAttributes redirectAttributes) {
    	if(bindingResult.hasErrors()) {
    		return "registration/registerForm";
    	}
    	try {
    		userRegistrationService.registerUser(user, confirmPassword);
    	}catch (IllegalArgumentException e) {
    		model.addAttribute("message", e.getMessage());
    		return "registration/registerForm";
		}
    	redirectAttributes.addFlashAttribute("message", "ユーザー登録が完了しました");
        return "redirect:/loginForm";
    }
}