package com.io.idmansour.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.idmansour.CrudMethods;

@Service
public class AdminService implements CrudMethods<Admin> {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin save(Admin obj) {
		return adminRepository.save(obj);
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public void delete(String id) {
		adminRepository.delete(adminRepository.findById(id).get());
	}
	
	
}
