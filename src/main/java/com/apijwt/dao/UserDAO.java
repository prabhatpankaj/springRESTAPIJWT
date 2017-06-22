package com.apijwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apijwt.objects.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
	User save(User user);

	User findByUserName(String username);
}