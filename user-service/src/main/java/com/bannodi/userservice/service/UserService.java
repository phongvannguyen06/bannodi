package com.bannodi.userservice.service;

import com.bannodi.userservice.model.Address;
import com.bannodi.userservice.model.User;
import com.bannodi.userservice.repository.AddressRepository;
import com.bannodi.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    private UserRepository userRepo;
    private AddressRepository addressRepo;

    @Autowired
    public UserService(UserRepository userRepo, AddressRepository addressRepo) {
        this.userRepo = userRepo;
        this.addressRepo = addressRepo;
    }

    public String registerUser(User newUser) {
        userRepo.save(newUser);
        return "register success";
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(long id) {
        return userRepo.findById(id).get();
    }

    public User updateUser(long userId, User user) {
        user.setId(userId);
        return userRepo.save(user);
    }

    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }

    public List<Address> getUserAddresses(long id) {
        return addressRepo.findAllByUserId(id);
    }

    public void updateUserAddress(long addressId, Address newAddress) {
        newAddress.setId(addressId);
        this.addressRepo.save(newAddress);
    }
}
