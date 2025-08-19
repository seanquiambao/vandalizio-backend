package com.example.vandalizio_backend.repositories.user;

import com.example.vandalizio_backend.model.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
