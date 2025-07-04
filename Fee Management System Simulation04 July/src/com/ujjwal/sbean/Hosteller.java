package com.ujjwal.sbean;

public class Hosteller extends Student
{
    private double hostelFee;

    public Hosteller()
    {
    	
    }

    public Hosteller(String name, int studentId, double examFee, double hostelFee) 
    {
        super(name, studentId, examFee);
        this.hostelFee = hostelFee;
    }

    public void setHostelFee(double hostelFee) 
    {
        this.hostelFee = hostelFee;
    }

    @Override
    public double payFee() 
    {
        return super.payFee() - hostelFee;
    }

    @Override
    public String displayDetails() 
    {
        return toString();
    }

    @Override
    public String toString() 
    {
        return "Hosteller [hostelFee=" + hostelFee + ", " + super.toString() + "]";
    }
}
