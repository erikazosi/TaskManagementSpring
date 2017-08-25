package com.tms.repository;

import com.tms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query("select u from User u where u.firstName like 's%'")
    List<User> findAllWithNameS();
}
