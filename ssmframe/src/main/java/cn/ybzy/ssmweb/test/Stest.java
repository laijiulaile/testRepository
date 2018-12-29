package cn.ybzy.ssmweb.test;

import java.io.IOException;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ybzy.ssmweb.mapper.UserMapper;
import cn.ybzy.ssmweb.model.User;

public class Stest {
	
	
    @Test
	public void test() throws IOException{
    	System.out.println("222");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        UserMapper userMapper=(UserMapper) ctx.getBean("userMapper");	
	    User user=userMapper.selectUser(5);
	    System.out.println(user);
		
    }
		
	
}
