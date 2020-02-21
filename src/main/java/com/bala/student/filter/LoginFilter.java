package com.bala.student.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bala.student.constant.SessionConstants;

public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		if (session.getAttribute(SessionConstants.USER_ID.toString()) != null) {
			if (session.getAttribute(SessionConstants.ROLE.toString()).toString()
					.equalsIgnoreCase(SessionConstants.ADMIN.toString())) {
				res.sendRedirect("student-admin-profile");
			} else {
				res.sendRedirect("student-profile");
			}

		} else {
			chain.doFilter(request, response);
		}
	}

}
