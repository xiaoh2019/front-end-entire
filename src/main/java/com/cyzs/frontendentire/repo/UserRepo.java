package com.cyzs.frontendentire.repo;

import com.cyzs.frontendentire.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: xh
 * @create: 2020-04-12 15:18
 */
public interface UserRepo extends JpaRepository<User, Integer> {

}
