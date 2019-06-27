package com.zqr.study.provider;

import com.zqr.study.api.IUserService;
import com.zqr.study.api.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-06-27 10:35
 */
@Controller
public class TestFunction {

    @Autowired
    private IUserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        User user = userService.getUserById(2);
        return user.toString();
    }

}
