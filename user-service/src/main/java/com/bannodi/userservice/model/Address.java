package com.bannodi.userservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "user" })
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String line1;
    private String line2;
    private String city;
    private String zipCode;
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
