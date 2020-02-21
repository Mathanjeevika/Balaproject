package com.bala.student.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bala.student.constant.SessionConstants;
import com.bala.student.dto.StudentDTO;
import com.bala.student.model.Student;
import com.bala.student.service.MailService;
import com.bala.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private MailService mailService;

	@GetMapping("/student-profile")
	public ModelAndView studentProfile() {
		return new ModelAndView("student_profile");
	}

	@GetMapping("/student-admin-profile")
	public ModelAndView singIn() {
		return new ModelAndView("admin_student_profile");
	}

	@PostMapping("/student/save")
	public Object saveStudent(@ModelAttribute StudentDTO studentDTO) {
		if (studentDTO != null) {
			return studentService.saveStudent(studentDTO);
		}
		return 415;
	}

	@GetMapping("/student/getDetails")
	public Object getDetails(HttpSession session) {
		Long regNo = Long.parseLong(session.getAttribute(SessionConstants.STUDENT_ID.toString()).toString());
		return studentService.getdetails(regNo).get();
	}

	@PostMapping("/student/admin/save")
	public Object adminSaveStudent(@ModelAttribute StudentDTO studentDTO) {
		Student student = null;
		if (studentDTO != null) {
			student = studentService.adminSaveStudent(studentDTO);
			mailService.sendEmail(student);
			return student;
		}
		return 415;
	}
}
