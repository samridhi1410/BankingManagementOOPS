package com.account.bank;

import java.util.Scanner;

//class for user details
class UserDetails{
	static String name ="";
	static String phoneNumber = "";
    static String email = "";
	static String address = "";
	static double balance;
	 
    public  void setname(String name) //setting name of the user
    {
    	this.name=name;
    }
	public void getname()
	{
		System.out.println("Name : " +name);//getting the name
	}
	
	 public  void setphoneNumber(String phoneNumber )//setting the phone number
	    {
		 this.phoneNumber=phoneNumber;
	    }
		public void  getphoneNumber() //getting the phone number
		{
			System.out.println("PhoneNumber :" + phoneNumber);
		}
		
		public void setemail(String email) // setting the email address
	    {
			this.email=email;
	    }
		public  void getemail() // getting the email address
		{
			System.out.println("Email : " + email);
		}
		public  void setaddress(String address) //setting the home address
	    {
			this.address=address;
	    }
		public  void getaddress()
		{
			System.out.println("Address : " + address); // getting the home address
		}
		public void setbalance(double balance) // current balance
	    {
			this.balance=balance;
			
	    }
		public  void getbalance()
		{
			System.out.println("Current Balance : " + balance);
		}
}

// making interface for deposit and withdrawal functions
interface Amount {
	
	void getdepositedAmt();
	void withdrawal(double x);
}
class HandlingAmount extends UserDetails implements  Amount  {
	
	 double depositedAmt = 0;
	 double withdrawal=0;
	 void setdepositedAmt(double depositedAmt) // setting the deposited amount
    {
		this.depositedAmt=depositedAmt;
	
    }
	public void getdepositedAmt() // doing calculation to get the amount after depositing the money
	{   
		
		System.out.println("The Deposited Amount is " + "Rs" + depositedAmt);
		System.out.println("Balance before total= "+ "Rs" +  balance );
		this.balance+=this.depositedAmt;
		System.out.println("The current balance is " + "Rs" +  balance );
	}
	
	public void withdrawal(double withdrawal) // setting the withdrawal amount
	{
		this.withdrawal=withdrawal;
	}
	public void getwithdrawal() // getting the withdrawal amount after the withdrawal completion
	{
		System.out.println("Balance before total= "+ "Rs" +  balance );
		this.balance-=this.withdrawal;
		System.out.println("The balance after withdrawal  is " + "Rs" +  balance );
	}
	
}


public class BankApplication {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name");
		String name_1=sc.nextLine();
		System.out.println("Enter Your Phone Number");
		String number_1=sc.nextLine();
		System.out.println("Enter Your Full Address");
		String address_1=sc.nextLine();
		System.out.println("Enter Your Email");
		String email_1=sc.nextLine();
		UserDetails User1=new UserDetails();
		User1.setname(name_1);
		User1.setphoneNumber(number_1);
		User1.setaddress(address_1);
		User1.setemail(email_1);
		User1.setbalance( 1000.2);
		User1.getname();
		User1.getphoneNumber();
		User1.getaddress();
		User1.getemail();
		User1.getbalance();
		HandlingAmount Amount=new  HandlingAmount();
		
		System.out.println("Enter the Deposited Amount");
		double Deposit=sc.nextDouble();	
	    Amount.setdepositedAmt(Deposit);
		Amount.getdepositedAmt();
		
		System.out.println("Enter Amount You Want To Withdrawal");
		double withdrawal=sc.nextDouble();
		Amount.withdrawal(withdrawal);
	    Amount.getwithdrawal();
	}

}
