package com.jcw.example;


import com.jcw.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/10.
 */
@ContextConfiguration("/applicationContext.xml")
@RunWith(SpringRunner.class)
@Transactional
public class UserMapperTest {

    @Autowired UserMapper userMapper;

    @Test
    public void getUsersTest() {
        int list = userMapper.getUsers();
        Assert.assertEquals(5,list);
    }

    @Test
    public void getUsersMapTest(){
        Map map = userMapper.getUsersMap();
        Assert.assertEquals(5,map.values().size());
    }
}
