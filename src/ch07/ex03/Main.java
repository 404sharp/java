package ch07.ex03;

import ch07.ex03.dao.UserDao;
import ch07.ex03.dao.UserDaoImpl;
import ch07.ex03.presentation.Console;
import ch07.ex03.presentation.UserIo;
import ch07.ex03.service.UserService;
import ch07.ex03.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		// 객체는 데이터(변수들)의 집합
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		Console.info("end.");
	}
}
