package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Reimbursement;

@Repository
public interface ReimbursementDAO extends JpaRepository<Reimbursement, Integer>{

	public List<Reimbursement> getAllReimbursement();
}
