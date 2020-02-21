package com.bala.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bala.student.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUserNameAndPassword(String username,String password);
}
