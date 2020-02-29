package com.bharath.vendor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.repositories.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepostory;

	@Override
	public Vendor getVendorById(int id) {
		Optional<Vendor> optVendor = vendorRepostory.findById(id);
		return optVendor.isPresent() ? optVendor.get() : null;
	}

	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepostory.findAll();
	}

	@Override
	public Vendor saveVendor(Vendor vendor) {
		return vendorRepostory.save(vendor);
	}

	@Override
	public Vendor updateVendor(Vendor vendor) {
		return vendorRepostory.save(vendor);
	}

	@Override
	public void deleteVendor(Vendor vendor) {
		vendorRepostory.delete(vendor);
	}

	@Override
	public void deleteVendorById(int id) {
		vendorRepostory.deleteById(id);
	}
}
