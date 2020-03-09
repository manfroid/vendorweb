package com.bharath.vendor.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.repositories.VendorRepository;

@RestController
@CrossOrigin
public class VendorRestController {

	@Autowired
	private VendorRepository vendorRepository;
	
	@GetMapping("/vendors")
	public List<Vendor> getAllVendors() {
		return vendorRepository.findAll();
	}
	
	@GetMapping("/vendors/{id}")
	public Vendor getVendorById(@PathVariable int id) {
		return vendorRepository.getOne(id);
	}
	
	@PostMapping("/vendors")
	public ResponseEntity<Vendor> createVendor(@RequestBody Vendor vendor) {
		return new ResponseEntity<>(vendorRepository.save(vendor), HttpStatus.CREATED);
	}
	
	@PutMapping("/vendors")
	public Vendor replaceVendor(@RequestBody Vendor vendor) {
		return vendorRepository.save(vendor);
	}	
	
	@PatchMapping("/vendors")
	public Vendor updateVendor(@RequestBody Vendor updVendor) {
		
		Vendor vendor = vendorRepository.getOne(updVendor.getId());
		
		String code = updVendor.getCode();
		if ((code != null) && !code.isEmpty()) {
			vendor.setCode(code);
		}		
		String name = updVendor.getName();
		if ((name != null) && !name.isEmpty()) {
			vendor.setName(name);
		}
		String type = updVendor.getType();
		if ((type != null) && !type.isEmpty()) {
			vendor.setType(type);
		}
		String email = updVendor.getEmail();
		if ((email != null) && !email.isEmpty()) {
			vendor.setEmail(email);
		}
		String phone = updVendor.getPhone();
		if ((phone != null) && !phone.isEmpty()) {
			vendor.setPhone(phone);
		}
		String address = updVendor.getAddress();
		if ((address != null) && !address.isEmpty()) {
			vendor.setAddress(address);
		}
		
		return vendorRepository.save(vendor);
	}	

	@DeleteMapping("/vendors")
	public void deleteVendor(@RequestBody Vendor vendor, HttpServletResponse response) {
		vendorRepository.delete(vendor);
		response.setStatus(HttpServletResponse.SC_NO_CONTENT);
	}
	
	@DeleteMapping("/vendors/{id}")
	public ResponseEntity<Void> deleteVendorById(@PathVariable int id) {
		vendorRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
