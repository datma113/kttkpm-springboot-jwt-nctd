package thanhdat.spring_boot_api_jwt_nctd.service;

import org.springframework.beans.factory.annotation.Autowired;

import thanhdat.spring_boot_api_jwt_nctd.entity.User;
import thanhdat.spring_boot_api_jwt_nctd.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	
}
