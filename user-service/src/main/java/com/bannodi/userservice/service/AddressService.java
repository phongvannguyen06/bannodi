package com.bannodi.userservice.service;

import com.bannodi.userservice.model.Address;
import com.bannodi.userservice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddressService {

    private AddressRepository addressRepo;

    @Autowired
    public AddressService(AddressRepository addressRepo) {
        this.addressRepo = addressRepo;
    }

    public Address getAddress(long id) {
        return addressRepo.findById(id).get();
    }
}
