package edu.wctc.restdemo.controller;

import edu.wctc.restdemo.entity.Address;
import edu.wctc.restdemo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;


    @GetMapping("/api/addresses")
    public List<Address> getAddresses() {
        List<Address> list = new ArrayList<>();
        addressRepository.findAll().forEach(list::add);
        return list;
    }
}
