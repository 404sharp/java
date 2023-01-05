package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService { // 업무명 + Service
	public User getUser(); // read
	public void addUser(User user); // create
	public void fixUser(String userName); // update
	public void delUser(); // delete
}
