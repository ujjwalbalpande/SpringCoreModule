package com.ujjwal.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujjwal.sbean.Account;
import com.ujjwal.sbean.Customer;

public class AccountTester 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com\\ujjwal\\cfg\\ApplicationCOntext.xml");
		Customer cus = context.getBean("cust",Customer.class);
		Account ac = context.getBean("acc",Account.class);
		
		System.out.println("==================================================================================");
		System.out.println("After getting the object ");
		System.out.println(cus);
		System.out.println(ac);
		System.out.println("----------------------------------------------------------------------------------");
		ac.deposit(4000);
		System.out.println("After deposite ");
		System.out.println(ac);
		System.out.println("----------------------------------------------------------------------------------");
		ac.withdraw(2000);
		System.out.println("After withdraw ");
		System.out.println(ac);

		System.out.println("==================================================================================");
	}
}
