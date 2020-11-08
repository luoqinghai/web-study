package com.datatables.demo.service;

import com.datatables.demo.bean.User;
import com.datatables.demo.common.res.R;

public interface UserService {

    R getPageUserList(User user);

    int insert(User user);

    int delete(Integer userId);

    User getById(Integer userId);

    int updateById(User user);
}
