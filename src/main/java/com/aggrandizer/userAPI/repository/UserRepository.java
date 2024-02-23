package com.aggrandizer.userAPI.repository;

import com.aggrandizer.userAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}