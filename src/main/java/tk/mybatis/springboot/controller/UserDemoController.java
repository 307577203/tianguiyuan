package tk.mybatis.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.springboot.mapper.UseroneMapper;
import tk.mybatis.springboot.model.User;

@RestController
@RequestMapping("/userdemo")
public class UserDemoController {
	
	@Autowired
  private UseroneMapper useroneMapper;
	@RequestMapping("/getFindUser")
	@ResponseBody
	public List<User> getFindUser(){
		List<User> list=null;
		list=useroneMapper.selectAll();
		return list;
		
	}

}
