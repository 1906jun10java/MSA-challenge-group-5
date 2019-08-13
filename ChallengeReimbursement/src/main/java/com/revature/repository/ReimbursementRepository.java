package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.bean.Reimbursement;

public interface ReimbursementRepository extends JpaRepository <Reimbursement, Integer>{}
