package tk.mybatis.springboot.mapper;

import tk.mybatis.springboot.model.UserInfo;
import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.util.MyMapper;

public interface UseroneMapper  extends MyMapper<User>{
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}