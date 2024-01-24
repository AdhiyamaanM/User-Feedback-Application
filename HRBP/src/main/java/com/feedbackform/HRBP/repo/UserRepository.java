package com.feedbackform.HRBP.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feedbackform.HRBP.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{


}
