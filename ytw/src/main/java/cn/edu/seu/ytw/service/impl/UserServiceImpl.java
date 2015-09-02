package cn.edu.seu.ytw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.seu.ytw.bean.user.User;
import cn.edu.seu.ytw.dao.UserDAO;
import cn.edu.seu.ytw.exception.LoginException;
import cn.edu.seu.ytw.exception.RegisterException;
import cn.edu.seu.ytw.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
/*	@Transactional(readOnly=true)
	public User login(String name, String password) throws LoginException {
		List<User> list = userDAO.findByParams("from User u where u.name=? ", name);
		if(list.size() == 0){
			throw new LoginException(LoginException.NAME_NOT_EXIST);
		}
		
		User user = list.get(0);
		if(!user.getPassword().equals(password)){
			throw new LoginException(LoginException.PASSWORD_ERROR);
		}
		return user;
	}

	public void register(String name, String password, String confirm) throws RegisterException {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		
		userDAO.save(user);
		
		
	}*/

	@Transactional(readOnly=true)
	public User login(String name, String password) throws LoginException {
		List<User> list = userDAO.findByParams("from User u where u.name=? ", name);
		if(list.size() == 0){
			throw new LoginException(LoginException.NAME_NOT_EXIST);
		}
		
		User user = list.get(0);
		if(!user.getPassword().equals(password)){
			throw new LoginException(LoginException.PASSWORD_ERROR);
		}
		return user;
	}

	public void register(String name, String password, String confirm) throws RegisterException {
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		
		userDAO.save(user);
		
		
	}
}
