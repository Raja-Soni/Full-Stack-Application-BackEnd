package com.myProject.Full.Stack.Backend.repository;

import com.myProject.Full.Stack.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
