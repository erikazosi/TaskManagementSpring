package com.fah.repository;

import com.fah.entity.UserOld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<UserOld, Long> {

    @Query("select u from UserOld u where u.firstName like 's%'")
    List<UserOld> findAllWithNameS();
}
