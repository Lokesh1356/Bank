package com.Project.Bank;


import java.time.LocalDate;
import java.util.Scanner;

public class MainApp {
	Account [] arr=new Account[10];
	int count=0;
	public static void main(String[] args) {

		MainApp appp=new MainApp();
		appp.menu1();
	
	}//Main Ends here.......
	
//////////////////////////////////////////////////////////////////////////////////
	
	public void menu1()
	{
		MainApp app=new MainApp();
		int cho;
		while(count<arr.length)
		{
			do
			{
				System.out.println();
				System.out.println("{◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆ 😎 Welcome to ASCII Bank 😎 ◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆}");
				System.out.println("\t1.Saving Account");
				System.out.println("\t2.Current Account");
				System.out.println("\t3 Salary Account");
				System.out.println("\t4.Loan Account");
				System.out.println("\t5.Display");
				System.out.println("\t6.Deposit Amount");
				System.out.println("\t7.Withdrawl Amount");
				System.out.println("\t8.Account delete");
				System.out.println("\t9.Exit");
				System.out.println("...............................................................................................................................");


				Scanner sc=new Scanner(System.in);
				cho=sc.nextInt();
			
				switch(cho)
				{
					case 1:
					{
						arr[count]=app.choice1();
						count ++;
						
					}break;
					
					case 2:
					{
						arr[count]=app.choice2();
						count ++;
						
					}break;
					
					case 3:
					{
						arr[count]=app.choice3();
						count ++;
						
					}break;
					
					case 4:
					{
						arr[count]=app.choice4();
						count ++;
						
					}break;
					
					case 5:
					{
						if(count==0)
						{
							System.out.println("No Data to display.......");
						}else
						{
							for(int i=0;i<count;i++)
							{
								arr[i].display();
							}
						}
						
					}break;
					
					case 6:
					{
						app.choice6(arr,count);
						
						
					}break;
					
					case 7:
					{
						app.choice7(arr,count);
						
					}break;
					
					case 8:
					{
						app.deleteAccount(arr,count);					
					}break;
					
					case 9:
					{
						System.out.println("Thank you......");
						count=20;					
					}break;
					
				
				}
				
		
			}while(cho==0);
		}
		
	
	}
///////////////////////////////////////////////////////////////////////////////////////////	
	public Account choice1()
	{
		System.out.println("Saving Account");
		Account s1=new SavingAccount();
		s1.user();
		((SavingAccount) s1).calIntrest();			//Type Casting
		//s1.display();
		return s1;
			
	}
/////////////////////////////////////////////////////////////////////////////////	
	public Account choice2()
	{
		System.out.println("Current Account");
		Account s1=new CurrentAccount();
		s1.user();
//		LocalDate GetLAstTransDate=LocalDate.now();
		
		((CurrentAccount) s1).calIntrest();					//Type Casting

		//s1.calIntrest();

		return s1;
	}
///////////////////////////////////////////////////////////////////////////////	
	public Account choice3()
	{		
		System.out.println("Salary Account");
		Account s1=new SalaryAccount();
		s1.user();
		
		((SalaryAccount) s1).calIntrest();		//Type Casting

		//s1.display();
		return s1;
		
	}
/////////////////////////////////////////////////////////////////////////////////	
	public Account choice4()
	{
		System.out.println("Loan Account");
		Account s1=new LoanAccount();
		s1.user();	

	//	s1.display();
		return s1;
		
	}
//////////////////////////////////////////////////////////////////////////////////
	
	public void choice6(Account[] arr,int count)
	{
		double DepositAmount;
		if(count!=0)
		{
			MainApp app=new MainApp();
			System.out.println("...............................................................................................................................");
			System.out.println("Deposit Menu");
			System.out.println("1.Saving Account");
			System.out.println("2.Current Account");
			System.out.println("3.Salary Account");
			System.out.println("4.Loan Account");
	
			
				int cho=0;
		
				Scanner sc=new Scanner(System.in);
				cho=sc.nextInt();
				
				
					System.out.println("Enter account Number : ");
					Scanner sc1=new Scanner (System.in);
					int acno=sc1.nextInt();
					
					if(cho==1)
					{
						
							for(int i=0;i<count;i++)
							{
								if(arr[i] instanceof SavingAccount)
								{
									if(arr[i].getAccNo()==acno)
									{
										Scanner sc2=new Scanner (System.in);
										System.out.println("Hello Sir.\n"+arr[i].getUserName());
										System.out.println("Enter Deposit Amount : ");
										DepositAmount=sc2.nextDouble();
										
										arr[i].setBalance(arr[i].getBalance()+DepositAmount);
										System.out.println("Amount diposit Succesfully");
										System.out.println("Your Account Balance is : "+arr[i].getBalance());
										break;
			
									}
								}else {System.out.println("There is no Account...");}

								
							} 

						
					}
					
					if(cho==2)
					{
						for(int i=0;i<count;i++)
						{
							if(arr[i] instanceof CurrentAccount)
							{
								if(arr[i].getAccNo()==acno)
								{
									Scanner sc2=new Scanner (System.in);
									System.out.println("Hello Sir.\n "+arr[i].getUserName());
									System.out.println("Enter Deposit Amount : ");
									DepositAmount=sc2.nextDouble();
				
									arr[i].setBalance(arr[i].getBalance()+DepositAmount);
									System.out.println("Amount diposit Succesfully");
									System.out.println("Your Account Balance is : "+arr[i].getBalance());

									break;
								}
							}else {System.out.println("There is no Account...");}
						}
					}
					
					if(cho==3)
					{
						for(int i=0;i<count;i++)
						{
							if(arr[i] instanceof SalaryAccount)
							{
								if(arr[i].getAccNo()==acno)
								{
									Scanner sc2=new Scanner (System.in);
									System.out.println("Hello Sir.\n "+arr[i].getUserName());
									System.out.println("Enter Deposit Amount : ");
									DepositAmount=sc2.nextDouble();
									
									 System.out.println("enter todays date (yyyy-mm-dd) : ");
									  Scanner input=new Scanner(System.in);
									  String date=input.next();
									  LocalDate today=LocalDate.parse(date);
									  arr[i].setLastTransDate(today);
									  
									 
									  if((arr[i].getLastTransDate().getMonthValue())-(arr[i].getCreateDate().getMonthValue())>2)
									  {
										 System.out.println("Your account Freeze..."); 
									  }
									  else
									  {
										  	arr[i].setBalance(arr[i].getBalance()+DepositAmount);
											System.out.println("Amount deposit Succesfully");
											System.out.println("Your Account Balance is : "+arr[i].getBalance());
											System.out.println("Last Transaction Date : "+arr[i].getLastTransDate());
										  
									  }
								
									break;
								}
							}else {System.out.println("There is no Account...");}
						}
					}
					
					if(cho==4)
					{
						for(int i=0;i<count;i++)
						{
							if(arr[i] instanceof LoanAccount)
							{
								if(arr[i].getAccNo()==acno)
								{
									Scanner sc2=new Scanner (System.in);
									System.out.println("Hello Sir.\n "+arr[i].getUserName());
									System.out.println("Enter Deposit Amount : ");
									DepositAmount=sc2.nextDouble();
									
									arr[i].setBalance(arr[i].getBalance()+DepositAmount);
									System.out.println("Amount diposit Succesfully");
									System.out.println("Your Account Balance is : "+arr[i].getBalance());

									break;
								}
							}else {System.out.println("There is no Account...");}
						}
					}
			}else {System.out.println("No data in System............");
			System.out.println("...............................................................................................................................");}
		
	}
	

//////////////////////////////////////////////////////////////////////////////////		
	public void choice7(Account[] arr,int count)
	{
		double DepositAmount;
		if(count!=0)
		{
			MainApp app=new MainApp();
			System.out.println("...............................................................................................................................");
			System.out.println("Withdrawal Menu");
			System.out.println("1.Saving Account");
			System.out.println("2.Current Account");
			System.out.println("3.Salary Account");
			System.out.println("4.Loan Account");
	
			
				int cho=0;
		
				Scanner sc=new Scanner(System.in);
				cho=sc.nextInt();
				
				
					System.out.println("Enter account Number : ");
					Scanner sc1=new Scanner (System.in);
					int acno=sc1.nextInt();
					
					if(cho==1)
					{
						
							for(int i=0;i<count;i++)
							{
								if(arr[i] instanceof SavingAccount)
								{
									if(arr[i].getAccNo()==acno)
									{
										Scanner sc2=new Scanner (System.in);
										System.out.println("Hello Sir.\n "+arr[i].getUserName());
										System.out.println("Enter Withdrawal Amount : ");
										DepositAmount=sc2.nextDouble();
										
										if(arr[i].getBalance()<DepositAmount)
										{
											System.out.println("Your Balance is Not Sufficient.");
											System.out.println("Deposit First😁😁😁😁😁..");

										}
										else
										{
											arr[i].setBalance(arr[i].getBalance()-DepositAmount);
											System.out.println("Amount Withdrawal Succesfully");
											System.out.println("Your Account Balance is : "+arr[i].getBalance());

											break;
										}
			
									}
								}else {System.out.println("There is no Account...");}
								
								
							}
						
					}
					
					if(cho==2)
					{
						//double DepositAmount;
						double overDraftAmount;
						
						System.out.println("Enter Current Account Number : ");
						Scanner sc4=new Scanner (System.in);
						 acno=sc4.nextInt();
						
						for(int i=0;i<count;i++)
						{
							if(arr[i] instanceof CurrentAccount)
							{
								if(arr[i].getAccNo()==acno)
								{
									Scanner sc2=new Scanner (System.in);
									System.out.println("Hello Sir.\n "+arr[i].getUserName());
									System.out.println("Enter Withdrawal Amount : ");
									DepositAmount=sc2.nextDouble();
									
									
									if(arr[i].getBalance()>DepositAmount || DepositAmount>arr[i].getLimit())
									{
										arr[i].setBalance(arr[i].getBalance()-DepositAmount);
										System.out.println("Amount Withdrawal Succesfully");
										System.out.println("Your Account Balance is : "+arr[i].getBalance());
										break;
									}
									else
									{
										arr[i].setOverDraft(DepositAmount-arr[i].getBalance());
										arr[i].setBalance(arr[i].getBalance()+arr[i].getOverDraft());
										arr[i].setBalance(arr[i].getBalance()-DepositAmount);
						
										System.out.println("Amount Withdrawal Succesfully");
										System.out.println("Your Account Balance is : "+arr[i].getBalance());
										break;
									}	
									
								}
							}else {System.out.println("There is no Account...");}
						}
					}
					
					if(cho==3)
					{
						for(int i=0;i<count;i++)
						{
							if(arr[i] instanceof SalaryAccount)
							{
								if(arr[i].getAccNo()==acno)
								{
									Scanner sc2=new Scanner (System.in);
									System.out.println("Hello Sir.\n "+arr[i].getUserName());
									System.out.println("Enter Withdrawal Amount : ");
									DepositAmount=sc2.nextDouble();
									
									if(arr[i].getBalance()<=10000)
									{
										System.out.println("Your Balance is Not Sufficient.");
										System.out.println("Deposit First😁😁😁😁😁..");									
									}
									else
									{
										arr[i].setBalance(arr[i].getBalance()-DepositAmount);
										System.out.println("Amount Withdrawal Succesfully");
										System.out.println("Your Account Balance is : "+arr[i].getBalance());

										break;
									}
		
								}
							}else {System.out.println("There is no Account...");}
							
							
						}
					}
					
					if(cho==4)
					{
						for(int i=0;i<count;i++)
						{
							if(arr[i] instanceof LoanAccount)
							{
								if(arr[i].getAccNo()==acno)
								{
									Scanner sc2=new Scanner (System.in);
									System.out.println("Hello Sir.\n"+arr[i].getUserName());
									System.out.println("Enter Withdrawal Amount : ");
									DepositAmount=sc2.nextDouble();
									if(arr[i].getBalance()<10000)
									{
										System.out.println("Your Balance is Not Sufficient.");
										System.out.println("Deposit First😁😁😁😁😁..");									
									}
									else
									{
										arr[i].setBalance(arr[i].getBalance()-DepositAmount);
										System.out.println("Amount Withdrawal Succesfully");
										System.out.println("Your Account Balance is : "+arr[i].getBalance());

										break;
									}
								}
							}else {System.out.println("There is no Account...");}
							
							
						}
					}
		}else {System.out.println("No data in System............");
		System.out.println("...............................................................................................................................");}
}
////////////////////////////////////////////////////////////////////////////////////////////
	public void deleteAccount(Account[] arr,int count)
	{
		if(count!=0)
		{
		
			System.out.println("Enter account Number : ");
			Scanner sc1=new Scanner (System.in);
			int acno=sc1.nextInt();
			
			if(count==0)
			{
				System.out.println("No Account to delete.");
			}
			else
			{
		
				for(int i=0;i<count;i++)
				{
					if(arr[i].getAccNo()==acno)
					{
						while(i<count)
						{
							arr[i]=arr[i+1];
							i++;
						}
		
							
					}			
				}
				count=count-1;
		
			}	
		}else {System.out.println("No data in System............");
		System.out.println("...............................................................................................................................");}
	}		
				
				
				
////////////////////////////////////////////////////////////////////////////////////////////
	
}//MainApp ends here....

