package com.apijwt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apijwt.dao.UserDAO;
import com.apijwt.objects.User;
import com.apijwt.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public User save(User user) {
		return userDAO.save(user);
	}

	public User findByUserName(String username) {
		return userDAO.findByUserName(username);
	}
}