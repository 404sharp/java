package ch07.ex03.presentation;

import ch07.ex03.domain.User;
import ch07.ex03.service.UserService;

public class UserIo { // User 업무에 국한된 것을 구현
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		String userName = Console.inStr("추가할 회원명을 입력하세요.");
		// create
		userService.addUser(new User(userName));
		// read
		Console.info(userService.getUser() + "을(를) 추가했습니다.");
		
		// update
		userName = Console.inStr("수정할 회원명을 입력하세요.");
		userService.fixUser(userName);
		// read
		Console.info(userService.getUser() + "을(를) 수정했습니다.");
		
		// delete
		userService.delUser(); // 실무: 삭제된 데이터의 갯수가 >0이면 성공
		Console.info("회원을 삭제했습니다.");
	}
}
