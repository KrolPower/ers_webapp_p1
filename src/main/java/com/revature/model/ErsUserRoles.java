package com.revature.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ers_user_roles")
public class ErsUserRoles {
	
	@Id
	@Column(name="ers_user_role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ersUserRoleId;
	
	@Column(name="user_role",unique=true,nullable=false)
	private String userRole;
	
	 

	public ErsUserRoles() {
		super();
	}
	
	public ErsUserRoles(String userRole) {
		super();
		this.userRole = userRole;
	}

	public ErsUserRoles(int ersUserRoleId, String userRole) {
		super();
		this.ersUserRoleId = ersUserRoleId;
		this.userRole = userRole;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ersUserRoleId, userRole);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErsUserRoles other = (ErsUserRoles) obj;
		return ersUserRoleId == other.ersUserRoleId && Objects.equals(userRole, other.userRole);
	}

	public int getErsUserRoleId() {
		return ersUserRoleId;
	}

	public void setErsUserRoleId(int ersUserRoleId) {
		this.ersUserRoleId = ersUserRoleId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "ErsUserRoles [ersUserRoleId=" + ersUserRoleId + ", userRole=" + userRole + "]";
	}
	
}
