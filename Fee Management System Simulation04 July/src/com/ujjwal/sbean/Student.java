package com.ujjwal.sbean;

public class Student
{
	private String name;
	private int studentId ;
	private double examFee  ;
	private double amount;
	
	
	public Student() 
	{
		super();
	}


	public Student(String name, int studentId, double examFee)
	{
		super();
		this.name = name;
		this.studentId = studentId;
		this.examFee = examFee;
	}


	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double payFee() 
	{
        return amount - examFee;
    }

    public String displayDetails() 
    {
        return toString();
    }

    @Override
    public String toString() {
        return "name=" + name + ", studentId=" + studentId +
               ", Amount for fee=" + amount + ", examFee=" + examFee;
    }
	
	
	
	

}
