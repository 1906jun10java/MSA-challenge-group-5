package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bean.Reimbursement;
import com.revature.service.ReimbursementService;

@RestController
@RefreshScope
@RequestMapping(value="/reimbursement")
public class ReimbursementController {
	
	private ReimbursementService reimbursementService;
	
	 @Autowired
	    public void setReimbursementService(ReimbursementService reimbursementService) {
	        this.reimbursementService = reimbursementService;
	    }

	    @GetMapping("/all")
	    public ResponseEntity<List<Reimbursement>> findAll() {
	        return new ResponseEntity<>(reimbursementService.findAll(), HttpStatus.OK);
	    }
}
