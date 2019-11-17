package com.awgp.awgpapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awgp.awgpapi.modal.Parijan;

@Repository
public interface ParijanRepository extends CrudRepository<Parijan, Long>{

}
