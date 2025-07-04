package com.ujjwal.sbean;

public class DayScholar extends Student 
{
    private double transportFee;

    public DayScholar()
    {
    	super();
    }

    public DayScholar(String name, int studentId, double examFee)
    {
        super(name, studentId, examFee);
    }

    public void setTransportFee(double transportFee) 
    {
        this.transportFee = transportFee;
    }

    @Override
    public double payFee() 
    {
        return super.payFee() - transportFee;
    }

    @Override
    public String displayDetails()
    {
        return toString();
    }

    @Override
    public String toString()
    {
        return "DayScholar [transportFee=" + transportFee + ", " + super.toString() + "]";
    }
}
