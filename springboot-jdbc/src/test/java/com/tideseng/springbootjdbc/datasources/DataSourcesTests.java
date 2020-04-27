package com.tideseng.springbootjdbc.datasources;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 自定义加载数据源
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DataSourcesTests {

    @Autowired
    private JdbcTemplate db1JdbcTemplate;
    @Autowired
    private JdbcTemplate db2JdbcTemplate;

    @Test
    public void dataSourcesTest(){
        String sql="insert into user(name,age) values('佳欢',17)";
        db1JdbcTemplate.execute(sql);

        String sql2="insert into user(name,age) values('佳欢',18)";
        db2JdbcTemplate.execute(sql2);
    }

}
