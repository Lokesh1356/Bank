package com.Project.Bank;

public  class SavingAccount extends Account implements Interest {

	double minBalance;
	
	public SavingAccount() {
		minBalance=10000;
		// TODO Auto-generated constructor stub
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public SavingAccount(double minbal)
	{
		minBalance=minbal;
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void display()
	{
		System.out.println("...............................................................................................................................");
		System.out.println("                                             Saving Account");
		System.out.println("...............................................................................................................................");
		System.out.println("    Account No.\t\t Name\t\t Balance\t\t Minimum Balance\t\t\t Interest/year");
		System.out.println("...............................................................................................................................");
		System.out.println("\t"+accNo+"\t\t"+userName+"\t\t"+balance+"\t\t\t\t"+minBalance+"\t\t\t\t"+intrest);
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		
//		super.display();
//		System.out.println("Minimun Balance : "+minBalance);
//		System.out.println("..........................................................");
//		System.out.println();
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void user()
	{
		super.user();
//		System.out.println("Enter Minimum Balance Amount (Balance shound be minimun 10000): ");
//		
//		Scanner sc1=new Scanner (System.in);

//		
//		minBalance=sc1.nextDouble();
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void calIntrest()
	{
		setIntrest(getBalance()*25*(6.5)/365);
		setIntrest(getIntrest()/100);
	}
/////////////////////////////////////////////////////////////////////////////////////		

	
}
