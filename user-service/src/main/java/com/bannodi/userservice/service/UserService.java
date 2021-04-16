package com.bannodi.userservice.service;

import com.bannodi.userservice.model.User;
import com.bannodi.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    private UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public String registerUser(User newUser) {
        userRepo.save(newUser);
        return "register success";
    }

    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }
}
