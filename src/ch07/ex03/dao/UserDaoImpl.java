package ch07.ex03.dao;

import ch07.ex03.domain.User;

public class UserDaoImpl implements UserDao {
	private User user; // database 대용. dependency를 멤버 변수로 표현한다.
	
	@Override
	public User selectUser() {
		return this.user;
	}

	@Override
	public void insertUser(User user) {
		this.user = user;
	}

	@Override
	public void updateUser(String userName) {
		this.user.setUserName(userName);
	}

	@Override
	public void deleteUser() {
		this.user = null;
	}
}
