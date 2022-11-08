package com.subhasis.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhasis.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository <User,Long>{

}
