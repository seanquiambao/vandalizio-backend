package com.example.vandalizio_backend.controllers.user;

import com.example.vandalizio_backend.model.user.User;
import com.example.vandalizio_backend.repositories.user.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/users")
    public Optional<User> findOneUser(Integer id) {
        return this.userRepository.findById(id);
    }

}
