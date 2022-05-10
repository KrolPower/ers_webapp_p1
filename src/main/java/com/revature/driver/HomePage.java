package com.revature.driver;

import java.util.Scanner;

public class HomePage {
	
	public void UserMenu()
	{
		
		System.out.println("=================================================================================================");
		System.out.println("				======********** ERS **********======");
		System.out.println("=================================================================================================\n");
		System.out.println("1. New Reimbursement Request");
		System.out.println("2. View Pending Reimbursement Request");
		System.out.println("3. View Resolved Reimbursement Request");
		System.out.println("4. View Profile");
		System.out.println("5. Update Profile");
		System.out.println("6. Check Email");
		System.out.println("7. Logout");
		System.out.println("\n===============================================================================================");		
	}
	
	public void ManagerMenu()
	{
		System.out.println("=================================================================================================");
		System.out.println("				======********** ERS **********======");
		System.out.println("=================================================================================================\n");
		System.out.println("1. Approve Reimbursement Request");
		System.out.println("2. Deny Reimbursement Request");
		System.out.println("3. View Pending Reimbursement Request");
		System.out.println("4. View Resolved Reimbursement Request By Manager");
		System.out.println("5. View All Employees");
		System.out.println("6. View Reimbursement Request By Employee");
		System.out.println("7. Logout");
		System.out.println("\n==============================================================================================");	
	}
	
}
