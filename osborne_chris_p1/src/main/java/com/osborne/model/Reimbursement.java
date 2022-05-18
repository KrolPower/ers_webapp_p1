package com.osborne.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursements")
public class Reimbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reimb_id;
	
	@Column(name = "reimb_amount", columnDefinition = "float default 0.00")
	private float reimb_amount;
	
	

	
	
	@Column(name = "reimb_submitted")
	private Date timeSubmitted;
	
	@Column(name = "reimb_resolved")
	private Date timeResolved;
	
	

	
	
	@Column(name = "reimb_description")
	private String reimb_description;
	
	@Column(name = "reimb_authorID", columnDefinition = "int default 0")
	private int reimb_authorID;
	
	@Column(name = "reimb_resolverID", columnDefinition = "int default 0")
	private int reimb_resolverID;
	
	@Column(name = "reimb_status")
	private String reimb_status = "Pending";
	
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(float reimb_amount, Date reimb_submitted, Date reimb_resolved,
			String reimb_description, int reimb_authorID, int reimb_resolverID, String reimb_status_ID,
			float reimb_type_ID) {
		super();
		this.reimb_amount = reimb_amount;
		this.timeSubmitted = reimb_submitted;
		this.timeResolved = reimb_resolved;
		this.reimb_description = reimb_description;
		this.reimb_authorID = reimb_authorID;
		this.reimb_resolverID = reimb_resolverID;
	}


	public long getReimb_id() {
		return reimb_id;
	}


	public void setReimb_id(long reimb_id) {
		this.reimb_id = reimb_id;
	}


	public float getReimb_amount() {
		return reimb_amount;
	}


	public void setReimb_amount(float reimb_amount) {
		this.reimb_amount = reimb_amount;
	}


	public Date getReimb_submitted() {
		return timeSubmitted;
	}


	public void setReimb_submitted(Time reimb_submitted) {
		this.timeSubmitted = reimb_submitted;
	}


	public Date getTimeResolved() {
		return timeResolved;
	}


	public void setTimeResolved(Time timeResolved) {
		this.timeResolved = timeResolved;
	}


	public String getReimb_description() {
		return reimb_description;
	}


	public void setReimb_description(String reimb_description) {
		this.reimb_description = reimb_description;
	}


	public float getreimb_authorID() {
		return reimb_authorID;
	}


	public void setreimb_authorID(int reimb_authorID) {
		this.reimb_authorID = reimb_authorID;
	}


	public float getreimb_resolverID() {
		return reimb_resolverID;
	}


	public void setreimb_resolverID(int reimb_resolverID) {
		this.reimb_resolverID = reimb_resolverID;
	}

}



