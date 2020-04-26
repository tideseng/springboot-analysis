package com.tideseng.springbootquick._3_componentscan;

import org.springframework.stereotype.Service;

/**
 * 实现类，让其被Spring托管，默认单例，默认id为类名
 */
@Service("userService2")
public class UserServiceImpl {

    public String getName(){
        return "佳欢";
    }

}
