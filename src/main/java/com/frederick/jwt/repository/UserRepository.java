package com.frederick.jwt.repository;

import com.frederick.jwt.Entity.UserEntity;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

@Resource
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUserKey(String userKey);
}
