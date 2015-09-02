package cn.edu.seu.ytw.service;

<<<<<<< HEAD
import cn.edu.seu.ytw.bean.user.User;
=======
import cn.edu.seu.ytw.bean.User;
>>>>>>> d5bdd0885d441c7fdec0665cb7e74fe90ce89958
import cn.edu.seu.ytw.exception.LoginException;
import cn.edu.seu.ytw.exception.RegisterException;

public interface UserService {
	User login(String name,String password) throws LoginException;
	void register(String name,String password,String confirm) throws RegisterException;
}
