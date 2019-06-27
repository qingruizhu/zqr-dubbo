package com.zqr.study.consumer;

import com.zqr.study.api.IUserService;
import com.zqr.study.api.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Auther: qingruizhu
 * @Date: 2019-06-26 14:37
 */
@Controller
@RequestMapping("/user")
public class UserFunction {

    @Autowired(required=false)
    private IUserService hhh;


    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    @ResponseBody
    public String findUserById(
            @RequestParam Integer id) {
        System.out.println("出来啊.........");
        User user = hhh.getUserById(id);
        return user.toString();
    }
}
