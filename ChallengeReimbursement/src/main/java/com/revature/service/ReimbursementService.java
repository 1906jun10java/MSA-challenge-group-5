package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.bean.Reimbursement;
import com.revature.repository.ReimbursementRepository;

@Service
public class ReimbursementService {

	private ReimbursementRepository reimbursementRepository;

    @Autowired
    public ReimbursementService(ReimbursementRepository reimbursementRepository) {
        this.reimbursementRepository = reimbursementRepository;
    }

    public List<Reimbursement> findAll() {
        return this.reimbursementRepository.findAll();
    }
}
