package cn.edu.seu.ytw.dao.impl;

import org.springframework.stereotype.Repository;

import cn.edu.seu.ytw.bean.user.User;
import cn.edu.seu.ytw.common.BaseDAOImpl;
import cn.edu.seu.ytw.dao.UserDAOCommon;

@Repository("userDAOCommon")
public class UserDAOCommonImpl extends BaseDAOImpl<User, Integer> implements UserDAOCommon {


}
