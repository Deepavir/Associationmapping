package com.example.BlogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BlogApplication.entity.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long>{

}
