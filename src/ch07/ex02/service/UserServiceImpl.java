package ch07.ex02.service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	// 멤버 변수 타입은 interface를 사용한다. dependency가 되기 때문이다.
	private UserDao userDao; // dependency = DAO
	
	public UserServiceImpl(UserDao userDao) { // DI (Dependency Injection)
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
