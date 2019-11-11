package cn.lzh.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lzh.ssm.pojo.User;
import cn.lzh.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//备注控制层测试
	@Resource
	private UserService userService;
	
	@RequestMapping("/list")
	public String getList(Model model) {
		List<User> users = userService.selectList();
		
		model.addAttribute("users", users);
		return "user_list";
	}
	@RequestMapping("/delete")
	public String deleteByPrimaryKey(Integer id) {
		userService.deleteByPrimaryKey(id);
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/login")
	public String login(String username,String password,Model m,HttpSession session) {
		User user = userService.login(username,password);
		
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:/user/list.do";
		}
		m.addAttribute("errorMsg", "账号或密码错");
		return "forward:/login.jsp";
	}
}
