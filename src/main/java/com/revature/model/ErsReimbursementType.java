package com.revature.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ers_reimbursement_type")
public class ErsReimbursementType {
	
	@Id
	@Column(name="reimb_type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reimbTypeId;
	
	@Column(name="reimb_type",unique = true,nullable = false)
	private String reimbType;

	public ErsReimbursementType() {
		super();
	}

	public ErsReimbursementType(String reimbType) {
		super();
		this.reimbType = reimbType;
	}

	public ErsReimbursementType(int reimbTypeId, String reimbType) {
		super();
		this.reimbTypeId = reimbTypeId;
		this.reimbType = reimbType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reimbType, reimbTypeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErsReimbursementType other = (ErsReimbursementType) obj;
		return Objects.equals(reimbType, other.reimbType) && reimbTypeId == other.reimbTypeId;
	}

	public int getReimbTypeId() {
		return reimbTypeId;
	}

	public void setReimbTypeId(int reimbTypeId) {
		this.reimbTypeId = reimbTypeId;
	}

	public String getReimbType() {
		return reimbType;
	}

	public void setReimbType(String reimbType) {
		this.reimbType = reimbType;
	}

	@Override
	public String toString() {
		return "ErsReimbursementType [reimbTypeId=" + reimbTypeId + ", reimbType=" + reimbType + "]";
	}
	
}
