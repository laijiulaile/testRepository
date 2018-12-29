package cn.ybzy.ssmweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ybzy.ssmweb.mapper.UserMapper;
import cn.ybzy.ssmweb.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> selectAllUsers() {
		
		return  userMapper.selectAllUser();
	}

}
