package thanhdat.spring_boot_api_jwt_nctd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thanhdat.spring_boot_api_jwt_nctd.entity.User;
import thanhdat.spring_boot_api_jwt_nctd.service.UserService;

@RestController
public class AuthenController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
    public User register(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userService.saveUser(user);
    }
}
