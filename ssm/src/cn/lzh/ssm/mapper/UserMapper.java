package cn.lzh.ssm.mapper;

import java.util.List;

import cn.lzh.ssm.pojo.User;

public interface UserMapper {
	
	List<User>selectList();
	
	Integer deleteByPrimaryKey(Integer id);

	User selectByUsername(String username);
}
