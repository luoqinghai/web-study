package com.datatables.demo.service.impl;

import com.datatables.demo.bean.User;
import com.datatables.demo.common.res.R;
import com.datatables.demo.mapper.UserMapper;
import com.datatables.demo.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public R getPageUserList(User user) {
        //查询条件
        Map<String, Object> searchCondition = new HashMap<String, Object>();

        if(StringUtils.isNotBlank(user.getUserName())) {
            searchCondition.put("userName", user.getUserName());
        }else {
            searchCondition.put("userName", null);
        }

        if(StringUtils.isNotBlank(user.getUserAddr())) {
            searchCondition.put("userAddr", user.getUserAddr());
        }else {
            searchCondition.put("userAddr", null);
        }

        if (-1 != user.getStatus()) {
            searchCondition.put("status", user.getStatus());
        }else {
            searchCondition.put("status", null);
        }

        if (-1 != user.getRoleId()) {
            searchCondition.put("roleId", user.getRoleId());
        }else {
            searchCondition.put("roleId", null);
        }

        if (StringUtils.isNotBlank(user.getDate())) {
            String[] dates = user.getDate().split(" - ");
            searchCondition.put("startDate", dates[0]);
            searchCondition.put("endDate", dates[1]);
        }else {
            searchCondition.put("startDate", null);
            searchCondition.put("endDate", null);
        }


        List<User> list = userMapper.getUserList(new RowBounds(user.getOffset(), user.getPageSize()), searchCondition);
        int count = userMapper.getUserListCount(new RowBounds(user.getOffset(), user.getPageSize()), searchCondition);

        R r = new R(user.getDraw(), count, count, list);
        return r;
    }

    @Override
    public int insert(User user) {
        //设置创建时间
        user.setCreateDate(new Date());
        return userMapper.insert(user);
    }

    @Override
    public int delete(Integer userId) {
        return userMapper.delete(userId);
    }

    @Override
    public User getById(Integer userId) {
        return userMapper.getById(userId);
    }

    @Override
    public int updateById(User user) {
        return userMapper.updateById(user);
    }
}
