package tk.mybatis.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tk.mybatis.springboot.mapper.UseroneMapper;

@Service
public class UserService {
	
	@Autowired
  private UseroneMapper useroneMapper;

	
}
