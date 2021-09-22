package thanhdat.spring_boot_api_jwt_nctd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thanhdat.spring_boot_api_jwt_nctd.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}