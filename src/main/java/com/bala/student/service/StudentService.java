package com.bala.student.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bala.student.dto.StudentDTO;
import com.bala.student.model.Student;
import com.bala.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UserService userService;

	
	
	public Student saveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		BeanUtils.copyProperties(studentDTO, student);
		student.setEdit(false);
		Student savedStudentInfo = studentRepository.save(student);
		userService.adminStudentSave(savedStudentInfo);
		return savedStudentInfo;
	}

	public Optional<Student> getdetails(Long studentId) {
		return studentRepository.findById(studentId);
	}

	public Student adminSaveStudent(StudentDTO studentDTO) {
		Student student = new Student();
		BeanUtils.copyProperties(studentDTO, student);
		student.setEdit(true);
		Student savedStudentInfo =  studentRepository.save(student);
		userService.adminStudentSave(savedStudentInfo);
		return savedStudentInfo;
	}
	
	

}
