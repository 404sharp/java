package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao { // 도메인명(데이터명) + Dao
	public User selectUser(); // select = read
}
