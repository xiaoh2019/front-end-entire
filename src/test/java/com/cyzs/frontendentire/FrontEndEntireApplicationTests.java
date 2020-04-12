package com.cyzs.frontendentire;

import com.cyzs.frontendentire.bean.User;
import com.cyzs.frontendentire.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FrontEndEntireApplicationTests {

    @Autowired
    UserRepo userRepo;

    @Test
    void contextLoads() {
        for (int i = 0; i < 200; i++) {
            User user = new User();
            user.setName("王二");
            user.setAge(18);
            user.setEmail("22@qq.com");
            user.setGender(1);
            user.setAddress("中国上海");
            userRepo.save(user);
        }
    }

}
