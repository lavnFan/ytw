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

import cn.edu.seu.ytw.bean.user.User;
import cn.edu.seu.ytw.common.BaseDAOImpl;
import cn.edu.seu.ytw.dao.UserDAO;
import cn.edu.seu.ytw.dao.UserDAOCommon;

@Repository("userDAOCommon")
public class UserDAOCommonImpl extends BaseDAOImpl<User, Integer> implements UserDAOCommon {


}
