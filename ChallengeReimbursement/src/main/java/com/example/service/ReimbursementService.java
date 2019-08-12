package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Reimbursement;
import com.example.dao.ReimbursementDAO;

@Service
public class ReimbursementService {

	private ReimbursementDAO reimbursementDAO;
	
	@Autowired
	public ReimbursementService (ReimbursementDAO reimbursementDAO) {
		this.reimbursementDAO = reimbursementDAO;
	}
	
	public List<Reimbursement> allReimbursements() {
		return this.reimbursementDAO.findAll();
	}
}
