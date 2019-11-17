package com.awgp.awgpapi.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awgp.awgpapi.modal.Parijan;
import com.awgp.awgpapi.services.ParijanService;

@RestController
@RequestMapping("/api/parijan")
public class ParijanController {

	@Autowired
	ParijanService parijanService;

	@PostMapping("/add")
	public ResponseEntity<?> addNewParijan(@Valid @RequestBody Parijan parijan, BindingResult result) {

		if (result.hasErrors()) {
			return new ResponseEntity<List<FieldError>>(result.getFieldErrors(), HttpStatus.BAD_REQUEST);
		}
		Parijan parsistedParijan = parijanService.saveOrUpdate(parijan);
		return new ResponseEntity<Parijan>(parsistedParijan, HttpStatus.CREATED);
	}

}
