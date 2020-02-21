package com.bala.student.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bala.student.dto.UserDTO;
import com.bala.student.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping({ "/", "/login" })
	public ModelAndView singIn() {
		System.out.println("Bala ");
//		loginService.save();
		return new ModelAndView("login");

	}

	@PostMapping("loginValidation")
	public Integer loginValidation(@ModelAttribute UserDTO userDto,HttpSession session) {
		if (userDto != null) {
			return loginService.validateUserCredentials(userDto,session);
		}
		return 415;

	}
}
