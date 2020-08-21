package com.io.idmansour.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "admin")
public class AdminContoller {
	@Autowired
	private AdminService adminService;
	@GetMapping(value = {"/","/all"})
	public List<Admin> findAll(){
		return adminService.findAll();
	}
}
