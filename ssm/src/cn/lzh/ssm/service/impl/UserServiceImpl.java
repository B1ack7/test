package cn.lzh.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lzh.ssm.mapper.UserMapper;
import cn.lzh.ssm.pojo.User;
import cn.lzh.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> selectList() {

		return userMapper.selectList();
	}

	@Override
	public Integer deleteByPrimaryKey(Integer id) {
		
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User login(String username, String password) {
		
		User user = userMapper.selectByUsername(username);
		if (user!=null) {
			if (!user.getPassword().equals(password)) {
				System.out.println(username);
				System.out.println(password);
				return null;
			}else {
				return user;
			}
		}
		return null;
	}

}
