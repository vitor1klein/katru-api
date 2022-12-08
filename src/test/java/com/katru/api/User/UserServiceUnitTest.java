package com.katru.api.User;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.katru.api.entity.User;
import com.katru.api.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceUnitTest {
    
    @Autowired
    private UserService userService;

    @Test
    public void nameOfMyTest(){
        List<User> users = userService.list();

        // TODO: check how to compare if size is greater than 
        Assert.assertEquals(users.size(),1);
    }
}
