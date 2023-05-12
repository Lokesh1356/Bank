package com.Project.Bank;

import java.time.LocalDate;
import java.util.Scanner;

public class SalaryAccount extends SavingAccount {
	

	
	public SalaryAccount() {
		
	 
		
	}
	

/////////////////////////////////////////////////////////////////////////////////////		

/////////////////////////////////////////////////////////////////////////////////////		

	public void display()
	{
		System.out.println("...............................................................................................................................");
		System.out.println("                 "+createDate+"                              Salary Account");
		System.out.println("...............................................................................................................................");
		System.out.println("    Account No.\t\t Name\t\t Balance\t\t Minimum Balance\t\t\t Interest/year");
		System.out.println("...............................................................................................................................");
		System.out.println("\t"+accNo+"\t\t"+userName+"\t\t"+balance+"\t\t         "+minBalance+"\t\t\t\t"+intrest);
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		
		
//		super.display();
//		System.out.println("Minimum Balance  is : "+this.minBalance);
//		System.out.println("..........................................................");
//		System.out.println();
	}
	
/////////////////////////////////////////////////////////////////////////////////////		

	public void user()
	{
		super.user();
		 System.out.println("enter todays date (yyyy-mm-dd) : ");
		  Scanner input=new Scanner(System.in);
		  String date=input.next();
		  LocalDate today=LocalDate.parse(date);
		  createDate=today;

		
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void calIntrest()
	{
		setIntrest(getBalance()*25*(6.5)/365);
		setIntrest(getIntrest()/100);
	}
/////////////////////////////////////////////////////////////////////////////////////		

	
	
	
	
}
