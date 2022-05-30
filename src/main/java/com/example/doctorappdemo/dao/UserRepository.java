package com.example.doctorappdemo.dao;

import com.example.doctorappdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Integer> {

    User findUserByEmail(String email);
    User findUserByUserName(String username);
    User findById(int id);
}

