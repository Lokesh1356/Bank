package com.Project.Bank;

import java.util.Scanner;

public  class LoanAccount extends Account  {

	double loan;
	double limit=55000;
	
	
	public LoanAccount() {
		// TODO Auto-generated constructor stub
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public LoanAccount(double ln)
	{
		loan=ln;
	}

	
/////////////////////////////////////////////////////////////////////////////////////		

	public double getLoan() {
		return loan;
	}

	public void setLoan(double loan) {
		this.loan = loan;
	}
	
/////////////////////////////////////////////////////////////////////////////////////		

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void display()
	{		
		System.out.println("...............................................................................................................................");
		System.out.println("                                             Loan Account");
		System.out.println("...............................................................................................................................");
		System.out.println("    Account No.\t\t Name\t\t Limit\t\t Loan Taken\t\t Unbilled amount");
		System.out.println("...............................................................................................................................");
		System.out.println("\t"+accNo+"\t\t"+userName+"\t\t"+limit+"\t\t\t"+loan+"\t\t\t"+loan);
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		
		
//		super.display();
//		System.out.println("Limit of Loan account : "+loneLimit);
//		System.out.println("Loan Amount is : "+loan);		
//		loan=loan-deposit;
//		System.out.println("Total Unbilled Outstanding : "+loan);
//		System.out.println("..........................................................");
//		System.out.println();
//	
		
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void user()
	{
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter Account No. : ");
		setAccNo(sc1.nextInt());
		
		System.out.println("Enter Account Holder Name : ");
		setUserName(sc1.next());

		System.out.println("Enter Loan Amount : ");
		loan=sc1.nextDouble();
	}
/////////////////////////////////////////////////////////////////////////////////////		
	
//	public void calIntrest() 
//	{
//		loan=loan 
//	}
/////////////////////////////////////////////////////////////////////////////////////		

	
}
