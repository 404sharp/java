package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao { // 도메인명(데이터명) + Dao
	public User selectUser(); // read; select + 도메인명
	public void insertUser(User user); // create; insert + 도메인명
	public void updateUser(String userName);
	public void deleteUser();
}
