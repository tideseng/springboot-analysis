package com.tideseng.springbootjdbc.datasource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 默认加载数据源
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DataSourceTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void dataSourceTest(){
        String sql="insert into user(name,age) values('佳欢',17)";
        jdbcTemplate.execute(sql);
    }

}
