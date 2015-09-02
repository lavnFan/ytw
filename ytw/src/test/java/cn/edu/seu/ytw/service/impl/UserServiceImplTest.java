package cn.edu.seu.ytw.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

<<<<<<< HEAD
import cn.edu.seu.ytw.bean.user.User;
=======
import cn.edu.seu.ytw.bean.User;
>>>>>>> d5bdd0885d441c7fdec0665cb7e74fe90ce89958
import cn.edu.seu.ytw.exception.LoginException;
import cn.edu.seu.ytw.exception.RegisterException;
import cn.edu.seu.ytw.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests{



	@Resource
	private UserService userService;
	
	@Resource
	private UserService userServiceCommon;
	
	
	@Test
	public void testLogin() {
		
		//IOC  inervsion of control   DI   dependency injection
		
//		UserService userService = (UserService) ctx.getBean("userService");
//		UserService userService = new UserServiceImpl();
		
		try {
			User user = userService.login("zhangsan", "12345");
			assertEquals("zhangsan",user.getName());
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testCommonLogin() {
		
		//IOC  inervsion of control   DI   dependency injection
		
//		UserService userService = (UserService) ctx.getBean("userService");
//		UserService userService = new UserServiceImpl();
		
		try {
			User user = userServiceCommon.login("zhangsan", "11111");
			assertEquals("zhangsan",user.getName());
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testRegister() {
		try {
			userService.register("qinshou", "44444", "44444");
		} catch (RegisterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
