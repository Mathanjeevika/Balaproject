package com.bala.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.student.model.Student;
import com.bala.student.model.User;
import com.bala.student.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void adminStudentSave(Student student) {
		User user = new User();
		user.setUserName(student.getFirstName());
		user.setPassword(student.getFatherName());
		user.setRole("STUDENT");
		user.setStudent(student);
		userRepository.save(user);
	}
}
