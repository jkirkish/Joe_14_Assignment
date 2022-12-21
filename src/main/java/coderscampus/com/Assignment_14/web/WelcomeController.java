package coderscampus.com.Assignment_14.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import coderscampus.com.Assignment_14.dto.CommunicationLine;
import coderscampus.com.Assignment_14.services.ComLineServices;


@Controller
public class WelcomeController {
	
	@Autowired
	private ComLineServices comLineService;
	
	@PostMapping("/createComLine")
	public String createChannel(CommunicationLine comLine) {
		comLineService.save(comLine);
		return "redirect:/welcome";
	}

	
}
