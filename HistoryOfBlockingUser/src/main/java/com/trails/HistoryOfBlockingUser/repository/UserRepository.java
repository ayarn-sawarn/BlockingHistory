package com.trails.HistoryOfBlockingUser.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trails.HistoryOfBlockingUser.model.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, String>{

}
