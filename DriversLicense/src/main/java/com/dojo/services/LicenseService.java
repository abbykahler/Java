package com.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.models.License;
import com.dojo.repos.LicenseRepo;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepo licenseRepo;
	
//	public LicenseService(LicenseRepo licenseRepo) {
//		this.licenseRepo = licenseRepo;
//	}
	
	public List<License> findAllLicenses() {
		return licenseRepo.findAll();
	}
	
	public License findLicense(Long id) {
		Optional<License> l = licenseRepo.findById(id);
		
		if (l.isPresent()) { 
			return l.get();
		} else {
			return null;
		}
	}
	
	public License createLicense(License l) {
		return licenseRepo.save(l);
	}
	
	public License updateLicense(Long id, License l) {
		License license = findLicense(id);
		license.setNumber(l.getNumber());
		license.setExpirationDate(l.getExpirationDate());
		license.setState(l.getState());
		license.setPerson(l.getPerson());
		
		licenseRepo.save(license);
		
		return license;
	}
	
	public void deleteLicense(Long id) {
		licenseRepo.deleteById(id);
	}
}
