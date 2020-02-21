package com.bala.student.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.student.constant.SessionConstants;
import com.bala.student.dto.UserDTO;
import com.bala.student.model.User;
import com.bala.student.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepository;

	public void save() {
		User user = new User();
		user.setUserName("bala");
		user.setPassword("test");
		user.setRole("ADMIN");
		userRepository.save(user);
	}

	public Integer validateUserCredentials(UserDTO userDto, HttpSession session) {
		User user = userRepository.findByUserNameAndPassword(userDto.getUserName(), userDto.getPassword());
		if (user == null) {
			return 403;
		} else if (user != null && user.isActive()) {
			session.setAttribute(SessionConstants.USER_NAME.toString(), user.getUserName());
			session.setAttribute(SessionConstants.ROLE.toString(), user.getRole());
			session.setAttribute(SessionConstants.USER_ID.toString(), user.getId());
			if (user.getStudent() != null) {
				session.setAttribute(SessionConstants.STUDENT_ID.toString(), user.getStudent().getId());
			}
			return 200;
		} else {
			return 401;
		}
	}
}
