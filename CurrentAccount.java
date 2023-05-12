package com.Project.Bank;

public   class CurrentAccount extends Account{

	
	CurrentAccount() {
		// TODO Auto-generated constructor stub
	}
/////////////////////////////////////////////////////////////////////////////////////		

	 CurrentAccount(double lm) {
		
		limit=lm;
	}
/////////////////////////////////////////////////////////////////////////////////////		

	

/////////////////////////////////////////////////////////////////////////////////////		

	public void display()
	{
		System.out.println("...............................................................................................................................");
		System.out.println("                                             Current Account");
		System.out.println("...............................................................................................................................");
		System.out.println("    Account No.\t\t Name\t\t Balance\t\t Over Draft\t\t\t Interest/year");
		System.out.println("...............................................................................................................................");
		System.out.println("\t"+accNo+"\t\t"+userName+"\t\t"+balance+"\t\t       "+overDraft+"\t\t\t\t"+intrest);
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
//		super.display();
//		System.out.println("Over Draft : "+overDraft);
//		System.out.println("..........................................................");
//		System.out.println();	
	}
/////////////////////////////////////////////////////////////////////////////////////		

	public void user()
	{
		super.user();
//		Scanner sc1=new Scanner (System.in);
//		System.out.println("Enter Over Draft Amount : ");
//		overDraft=sc1.nextDouble();
	}
/////////////////////////////////////////////////////////////////////////////////////		
	public void calIntrest()
	{
		setIntrest(getBalance()*25*(4.5)/365);
		setIntrest(getIntrest()/100);
	}

/////////////////////////////////////////////////////////////////////////////////////		

	
/////////////////////////////////////////////////////////////////////////////////////		

	
	
	
	
}
