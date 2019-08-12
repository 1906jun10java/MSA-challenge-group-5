package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Reimbursement;
import com.example.service.ReimbursementService;

@RestController
@RequestMapping(value="/reimbursement")
public class ReimbursementController {

	private ReimbursementService reimbursementService;
	
	@Autowired
	public void setReimbursementService(ReimbursementService reimbursementService) {
		this.reimbursementService = reimbursementService;
	}
	
	@GetMapping(value="/all")
	public ResponseEntity<List<Reimbursement>> getAllReimbursements() {
		return new ResponseEntity<>(reimbursementService.allReimbursements(), HttpStatus.OK);
	}
}
