package com.apijwt.service;

import com.apijwt.objects.User;

public interface UserService {
	User save(User user);

	User findByUserName(String username);
}
