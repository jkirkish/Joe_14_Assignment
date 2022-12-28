package coderscampus.com.Assignment_14.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import coderscampus.com.Assignment_14.domain.User;
import coderscampus.com.Assignment_14.services.UserService;

@RestController
public class RegisteredUserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public Boolean initiateWelcomeUserSession(@RequestBody String name) {
		List<User> users = userService.findAll();
		boolean result = users.stream().anyMatch(answer -> users.contains(name));

		if (result == true) {
			System.out.println("Result : is " + result);

		} else {
			System.out.println("Result : is " + false);
		}
		return result;
	}

}
