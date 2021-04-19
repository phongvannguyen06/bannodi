package com.bannodi.userservice.repository;

import com.bannodi.userservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByUserId(long id);
}
