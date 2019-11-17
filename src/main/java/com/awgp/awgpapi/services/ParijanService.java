package com.awgp.awgpapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awgp.awgpapi.modal.Parijan;
import com.awgp.awgpapi.repository.ParijanRepository;

@Service
public class ParijanService {

	@Autowired
	private ParijanRepository parijanRepository;
	
	public Parijan saveOrUpdate(Parijan parijan){
		return parijanRepository.save(parijan); 
	}
}
