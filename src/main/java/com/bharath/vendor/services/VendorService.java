package com.bharath.vendor.services;

import java.util.List;

import com.bharath.vendor.entities.Vendor;

public interface VendorService {

	Vendor getVendorById(int id);

	List<Vendor> getAllVendors();

	Vendor saveVendor(Vendor vendor);

	Vendor updateVendor(Vendor vendor);

	void deleteVendor(Vendor vendor);

	void deleteVendorById(int id);
}
