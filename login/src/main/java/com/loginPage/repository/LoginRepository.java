package com.loginPage.repository;

import com.loginPage.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<LoginEntity,Long> {

    Optional<LoginEntity>findByUsername(String username);
}
