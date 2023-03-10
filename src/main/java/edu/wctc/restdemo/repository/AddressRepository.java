package edu.wctc.restdemo.repository;

import edu.wctc.restdemo.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
