package com.travel.api.repository;

import com.travel.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
    User findByEmail(String email);
    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail1);
}
