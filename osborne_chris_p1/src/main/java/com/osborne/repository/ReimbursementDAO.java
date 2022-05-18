package com.osborne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osborne.model.Reimbursement;


@Repository
public interface ReimbursementDAO extends JpaRepository<Reimbursement, Long>{

}
