package cn.edu.seu.ytw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.seu.ytw.bean.user.User;
import cn.edu.seu.ytw.dao.UserDAOCommon;
import cn.edu.seu.ytw.exception.LoginException;
import cn.edu.seu.ytw.exception.RegisterException;
import cn.edu.seu.ytw.service.UserService;

@Service("userServiceCommon")
@Transactional
public class UserServiceCommonImpl implements UserService {

	private UserDAOCommon userDAOCommon;
	
	@Autowired
	public void setUserDAOCommon(UserDAOCommon userDAOCommon) {
		this.userDAOCommon = userDAOCommon;
	}
	
	public User login(String name, String password) throws LoginException {
		User user = userDAOCommon.getByHQL("from User u where u.name=?", name);
		if(user == null){
			throw new LoginException(LoginException.NAME_NOT_EXIST);
		}
		if(!user.getPassword().equals(password)){
			throw new LoginException(LoginException.PASSWORD_ERROR);
		}
		return user;
	}

	public void register(String name, String password, String confirm) throws RegisterException {
		// TODO Auto-generated method stub
		
	}

}
