package com.zqr.study.provider;

import com.zqr.study.api.IUserService;
import com.zqr.study.api.vo.User;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-06-26 10:22
 */
@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {


    @Override
    public User getUserById(int id) {
        User user = new User();
        user.setId(3);
        user.setName("三岁的隔壁老王");
        System.out.println("zqr-provider[UserServiceImpl.getUserById]....."+user.toString());
        return user;
    }
}
