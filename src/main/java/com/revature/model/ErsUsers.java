package com.revature.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ers_users")
public class ErsUsers {
	
	@Id
	@Column(name="ers_users_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ersUsersId;
	
	@Column(name="ers_username")
	private String ersUsername;
	
	@Column(name="ers_password")
	private String ersPassword;
	
	@Column(name="ers_first_name")
	private String ersFirstName;
	
	@Column(name="ers_last_name")
	private String ersLastName;
	
	@Column(name="ers_email")
	private String ersEmail;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ers_user_role_id")
	private ErsUserRoles user_role_id;


	public ErsUsers() {
		super();
	}


	public ErsUsers(String ersUsername, String ersPassword, String ersFirstName, String ersLastName, String ersEmail,
			ErsUserRoles user_role_id) {
		super();
		this.ersUsername = ersUsername;
		this.ersPassword = ersPassword;
		this.ersFirstName = ersFirstName;
		this.ersLastName = ersLastName;
		this.ersEmail = ersEmail;
		this.user_role_id = user_role_id;
	}


	public ErsUsers(int ersUsersId, String ersUsername, String ersPassword, String ersFirstName, String ersLastName,
			String ersEmail, ErsUserRoles user_role_id) {
		super();
		this.ersUsersId = ersUsersId;
		this.ersUsername = ersUsername;
		this.ersPassword = ersPassword;
		this.ersFirstName = ersFirstName;
		this.ersLastName = ersLastName;
		this.ersEmail = ersEmail;
		this.user_role_id = user_role_id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ersEmail, ersFirstName, ersLastName, ersPassword, ersUsername, ersUsersId, user_role_id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErsUsers other = (ErsUsers) obj;
		return Objects.equals(ersEmail, other.ersEmail) && Objects.equals(ersFirstName, other.ersFirstName)
				&& Objects.equals(ersLastName, other.ersLastName) && Objects.equals(ersPassword, other.ersPassword)
				&& Objects.equals(ersUsername, other.ersUsername) && ersUsersId == other.ersUsersId
				&& Objects.equals(user_role_id, other.user_role_id);
	}


	public int getErsUsersId() {
		return ersUsersId;
	}


	public void setErsUsersId(int ersUsersId) {
		this.ersUsersId = ersUsersId;
	}


	public String getErsUsername() {
		return ersUsername;
	}


	public void setErsUsername(String ersUsername) {
		this.ersUsername = ersUsername;
	}


	public String getErsPassword() {
		return ersPassword;
	}


	public void setErsPassword(String ersPassword) {
		this.ersPassword = ersPassword;
	}


	public String getErsFirstName() {
		return ersFirstName;
	}


	public void setErsFirstName(String ersFirstName) {
		this.ersFirstName = ersFirstName;
	}


	public String getErsLastName() {
		return ersLastName;
	}


	public void setErsLastName(String ersLastName) {
		this.ersLastName = ersLastName;
	}


	public String getErsEmail() {
		return ersEmail;
	}


	public void setErsEmail(String ersEmail) {
		this.ersEmail = ersEmail;
	}


	public ErsUserRoles getUser_role_id() {
		return user_role_id;
	}


	public void setUser_role_id(ErsUserRoles user_role_id) {
		this.user_role_id = user_role_id;
	}


	@Override
	public String toString() {
		return "ErsUsers [ersUsersId=" + ersUsersId + ", ersUsername=" + ersUsername + ", ersPassword=" + ersPassword
				+ ", ersFirstName=" + ersFirstName + ", ersLastName=" + ersLastName + ", ersEmail=" + ersEmail
				+ ", user_role_id=" + user_role_id + "]";
	}
}
