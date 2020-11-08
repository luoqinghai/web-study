package com.datatables.demo.mapper;

import com.datatables.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    //查询分页数据
    List<User> getUserList(RowBounds rowBounds, Map<String, Object> map);

    //查询数据总条数
    int getUserListCount(RowBounds rowBounds, Map<String, Object> map);

    int insert(User user);

    int delete(Integer userId);

    User getById(Integer userId);

    int updateById(User user);
}
