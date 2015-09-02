package cn.edu.seu.ytw.dao;

import java.util.List;

<<<<<<< HEAD
import cn.edu.seu.ytw.bean.user.User;
=======
import cn.edu.seu.ytw.bean.User;
>>>>>>> d5bdd0885d441c7fdec0665cb7e74fe90ce89958

public interface UserDAO {
	List<User> findByParams(String hql,Object...params);
	void save(User user);
}
