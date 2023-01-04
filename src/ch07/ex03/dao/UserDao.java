package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser(); // read
	public void insertUser(User user); // create
	public void updateUser(String userName);
	public void deleteUser();
}
