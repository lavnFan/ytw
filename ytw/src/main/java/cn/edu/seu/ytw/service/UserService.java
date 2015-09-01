package cn.edu.seu.ytw.service;

import cn.edu.seu.ytw.bean.User;
import cn.edu.seu.ytw.exception.LoginException;
import cn.edu.seu.ytw.exception.RegisterException;

public interface UserService {
	User login(String name,String password) throws LoginException;
	void register(String name,String password,String confirm) throws RegisterException;
}
