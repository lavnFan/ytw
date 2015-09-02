package cn.edu.seu.ytw.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import cn.edu.seu.ytw.bean.user.User;
=======
import cn.edu.seu.ytw.bean.User;
>>>>>>> d5bdd0885d441c7fdec0665cb7e74fe90ce89958
import cn.edu.seu.ytw.dao.UserDAO;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	
/*	private JdbcTemplate jdbcTemplate;
	
	@Autowired //×¢Èë
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<User> findByParams(String sql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(User user) {
		jdbcTemplate.update("insert into user (name,password) values (?,?)",user.getName(),user.getPassword());
	}*/
	
	@Resource
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	
	public List<User> findByParams(String hql, Object... params) {
		Session session = getCurrentSession();
		Query query = session.createQuery(hql);
		if(params!=null){
			for(int i=0;i<params.length;i++){
				query.setParameter(i, params[i]);
			}
		}
		
		return query.list();
	}

	public void save(User user) {
		Session session = getCurrentSession();
		session.save(user);
	}

}
