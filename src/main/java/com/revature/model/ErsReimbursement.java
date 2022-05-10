package com.revature.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ers_reimbursement")
public class ErsReimbursement {

	@Id
	@Column(name="reimb_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reimbId;
	
	@Column(name="reimb_amount")
	private long reimbAmount;
	
	@Column(name="reimb_submitted")
	private Date reimbSubmitted;
	
	@Column(name="reimb_resolved")
	private Date reimbResolved;
	
	@Column(name="reimb_description")
	private String reimbDescription;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_ers_reimbursement_status")
	private ErsReimbursementStatus reimb_status_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_ers_reimbursement_type")
	private ErsReimbursementType reimb_type_id;

	public ErsReimbursement() {
		super();
	}

	public ErsReimbursement(long reimbAmount, Date reimbSubmitted, Date reimbResolved, String reimbDescription,
			ErsReimbursementStatus reimb_status_id, ErsReimbursementType reimb_type_id) {
		super();
		this.reimbAmount = reimbAmount;
		this.reimbSubmitted = reimbSubmitted;
		this.reimbResolved = reimbResolved;
		this.reimbDescription = reimbDescription;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}

	public ErsReimbursement(int reimbId, long reimbAmount, Date reimbSubmitted, Date reimbResolved,
			String reimbDescription, ErsReimbursementStatus reimb_status_id, ErsReimbursementType reimb_type_id) {
		super();
		this.reimbId = reimbId;
		this.reimbAmount = reimbAmount;
		this.reimbSubmitted = reimbSubmitted;
		this.reimbResolved = reimbResolved;
		this.reimbDescription = reimbDescription;
		this.reimb_status_id = reimb_status_id;
		this.reimb_type_id = reimb_type_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(reimbAmount, reimbDescription, reimbId, reimbResolved, reimbSubmitted, reimb_status_id,
				reimb_type_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErsReimbursement other = (ErsReimbursement) obj;
		return reimbAmount == other.reimbAmount && Objects.equals(reimbDescription, other.reimbDescription)
				&& reimbId == other.reimbId && Objects.equals(reimbResolved, other.reimbResolved)
				&& Objects.equals(reimbSubmitted, other.reimbSubmitted)
				&& Objects.equals(reimb_status_id, other.reimb_status_id)
				&& Objects.equals(reimb_type_id, other.reimb_type_id);
	}

	public int getReimbId() {
		return reimbId;
	}

	public void setReimbId(int reimbId) {
		this.reimbId = reimbId;
	}

	public long getReimbAmount() {
		return reimbAmount;
	}

	public void setReimbAmount(long reimbAmount) {
		this.reimbAmount = reimbAmount;
	}

	public Date getReimbSubmitted() {
		return reimbSubmitted;
	}

	public void setReimbSubmitted(Date reimbSubmitted) {
		this.reimbSubmitted = reimbSubmitted;
	}

	public Date getReimbResolved() {
		return reimbResolved;
	}

	public void setReimbResolved(Date reimbResolved) {
		this.reimbResolved = reimbResolved;
	}

	public String getReimbDescription() {
		return reimbDescription;
	}

	public void setReimbDescription(String reimbDescription) {
		this.reimbDescription = reimbDescription;
	}

	public ErsReimbursementStatus getReimb_status_id() {
		return reimb_status_id;
	}

	public void setReimb_status_id(ErsReimbursementStatus reimb_status_id) {
		this.reimb_status_id = reimb_status_id;
	}

	public ErsReimbursementType getReimb_type_id() {
		return reimb_type_id;
	}

	public void setReimb_type_id(ErsReimbursementType reimb_type_id) {
		this.reimb_type_id = reimb_type_id;
	}

	@Override
	public String toString() {
		return "ErsReimbursement [reimbId=" + reimbId + ", reimbAmount=" + reimbAmount + ", reimbSubmitted="
				+ reimbSubmitted + ", reimbResolved=" + reimbResolved + ", reimbDescription=" + reimbDescription
				+ ", reimb_status_id=" + reimb_status_id + ", reimb_type_id=" + reimb_type_id + "]";
	}
}
