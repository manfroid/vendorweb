package com.bharath.vendor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bharath.vendor.entities.Vendor;
import com.bharath.vendor.services.VendorService;

@Controller
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}
	
	@PostMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor savedVendor = vendorService.saveVendor(vendor);
		modelMap.addAttribute("message",
				"Saved vendor " + savedVendor.getName() + " with ID " + savedVendor.getId());
		return "createVendor";
	}
	
	@RequestMapping("/showAllVendors")
	public String showAllVendors(ModelMap modelMap) {
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "showVendors";
	}
	
	@RequestMapping("/showEdit")
	public String showEdit(@RequestParam("id") int id, ModelMap modelMap) {
		Vendor vendor = vendorService.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "editVendor";
	}

	@PostMapping("/updateVendor")
	public String update(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		vendorService.updateVendor(vendor);
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "showVendors";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		vendorService.deleteVendorById(id);
		List<Vendor> vendors = vendorService.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "showVendors";
	}
}
