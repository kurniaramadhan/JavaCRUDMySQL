package org.itenas.oop.jdbc.dao;

import org.itenas.oop.jdbc.bean.User;

public interface UserDAO {
	public User getUserByEmailAndPassword(String email, String password);
}
