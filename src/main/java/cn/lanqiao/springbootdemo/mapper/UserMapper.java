package cn.lanqiao.springbootdemo.mapper;

import cn.lanqiao.springbootdemo.entity.User;
import cn.lanqiao.springbootdemo.vo.QueryUserVO;
import cn.lanqiao.springbootdemo.vo.UserVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
@Select(value = "select *from ssy_user")
    List<User> queryUserList();
@Insert(value = "insert into ssy_user( password, user_name) VALUES (#{password},#{userName})")
    void insert(User user);

    List<UserVO> query2(QueryUserVO queryUserVO);
}
