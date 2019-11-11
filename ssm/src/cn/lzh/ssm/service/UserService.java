package cn.lzh.ssm.service;

import java.util.List;

import cn.lzh.ssm.pojo.User;

public interface UserService {
	List<User>selectList();
	
	Integer deleteByPrimaryKey(Integer id);

	User login(String username, String password);

	
}
