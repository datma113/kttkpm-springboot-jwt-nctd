package thanhdat.spring_boot_api_jwt_nctd.service;

import org.springframework.stereotype.Service;

import thanhdat.spring_boot_api_jwt_nctd.entity.User;

@Service
public interface UserService {
	 User saveUser(User user);
}
