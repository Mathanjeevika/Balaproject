package com.bala.student.service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.bala.student.model.Student;

@Service
public class MailService {

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	private Environment environment;

	public void sendEmail(Student student) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		try {

			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

			mimeMessageHelper.setSubject(environment.getProperty("mail.subject"));
			mimeMessageHelper.setFrom(new InternetAddress(environment.getProperty("spring.mail.username")));
			mimeMessageHelper.setTo(student.getMail());
			mimeMessageHelper.setText("Hello");
			mailSender.send(mimeMessageHelper.getMimeMessage());

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
