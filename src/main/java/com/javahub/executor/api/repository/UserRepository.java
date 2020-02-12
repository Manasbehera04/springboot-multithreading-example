package com.javahub.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javahub.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
