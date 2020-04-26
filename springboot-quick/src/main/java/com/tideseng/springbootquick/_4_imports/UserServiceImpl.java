package com.tideseng.springbootquick._4_imports;

import org.springframework.stereotype.Service;

/**
 * 实现类，让其被Spring托管，默认单例，默认id为类名
 */
@Service("userService3")
public class UserServiceImpl {

    public String getName(){
        return "佳欢";
    }

}
