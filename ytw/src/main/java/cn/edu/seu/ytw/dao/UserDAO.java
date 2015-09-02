package cn.edu.seu.ytw.dao;

import java.util.List;

import cn.edu.seu.ytw.bean.user.User;

public interface UserDAO {
	List<User> findByParams(String hql,Object...params);
	void save(User user);
}
