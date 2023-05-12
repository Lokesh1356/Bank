package com.Project.Bank;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class  Account  {
	int accNo;
	String userName;
	double balance;
	double depositAmount;
	double intrest;
	double overDraft=0;
	double limit=50000;
	LocalDate createDate;
	LocalDate LastTransDate;

	
	public Account() {
		// TODO Auto-generated constructor stub
	}
/////////////////////////////////////////////////////////////////////////////////////		
	
	public Account ( int an ,String nm,double bal)
	{
		accNo=an;
		userName=nm;
		balance =bal;
	}
/////////////////////////////////////////////////////////////////////////////////////	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
/////////////////////////////////////////////////////////////////////////////////////		
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
/////////////////////////////////////////////////////////////////////////////////////		
	
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
/////////////////////////////////////////////////////////////////////////////////////
	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
/////////////////////////////////////////////////////////////////////////////////////
	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
/////////////////////////////////////////////////////////////////////////////////////

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
/////////////////////////////////////////////////////////////////////////////////////	
	public LocalDate getLastTransDate() {
		return LastTransDate;
	}

	public void setLastTransDate(LocalDate lastTransDate) {
		LastTransDate = lastTransDate;
	}
	
/////////////////////////////////////////////////////////////////////////////////////	

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
/////////////////////////////////////////////////////////////////////////////////////	

	public void user()
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Account No. : ");
		accNo=sc1.nextInt();
		
		System.out.println("Enter Account Holder Name : ");
		userName=sc1.next();
		
		System.out.println("Enter Account Holder Balance : ");
		balance=sc1.nextDouble();
	}
/////////////////////////////////////////////////////////////////////////////////////		
	
	abstract public void display() ;
/////////////////////////////////////////////////////////////////////////////////////		

	
/////////////////////////////////////////////////////////////////////////////////////		


	

}