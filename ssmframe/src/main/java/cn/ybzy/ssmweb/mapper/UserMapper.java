package cn.ybzy.ssmweb.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.ybzy.ssmweb.model.User;

@Repository
public interface UserMapper {
	
	public List<User> selectAllUser();

	public User selectUser(Integer id);
	
	public  String getusername(Integer id);
	
	public int addUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(Integer id);
	
}
