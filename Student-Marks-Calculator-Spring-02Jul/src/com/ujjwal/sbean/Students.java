package com.ujjwal.sbean;

public class Students 
{
	private String student_name;
	private int student_rollNo;
	private double math_Marks;
	private double physics_Marks;
	private double chemistry_marks;
	private double english_marks;
	private double physicalEdu_marks;
	private boolean isExamAttended;
	private double average ;
	
	public Students(String student_name, int student_rollNo, double math_Marks, double physics_Marks,
			double chemistry_marks, double english_marks, double physicalEdu_marks, boolean isExamAttended
			) 
	{
		
		this.student_name = student_name;
		this.student_rollNo = student_rollNo;
		this.math_Marks = math_Marks;
		this.physics_Marks = physics_Marks;
		this.chemistry_marks = chemistry_marks;
		this.english_marks = english_marks;
		this.physicalEdu_marks = physicalEdu_marks;
		this.isExamAttended = isExamAttended;
		
	}
	
	public void setStudent_name(String student_name)
	{
		this.student_name = student_name;
	}



	public void setStudent_rollNo(int student_rollNo) 
	{
		this.student_rollNo = student_rollNo;
	}



	public void setMath_Marks(int math_Marks) 
	{
		this.math_Marks = math_Marks;
	}



	public void setPhysics_Marks(int physics_Marks) 
	{
		this.physics_Marks = physics_Marks;
	}



	public void setChemistry_marks(float chemistry_marks) 
	{
		this.chemistry_marks = chemistry_marks;
	}



	public void setEnglish_marks(double english_marks)
	{
		this.english_marks = english_marks;
	}



	public void setPhysicalEdu_marks(double physicalEdu_marks)
	{
		this.physicalEdu_marks = physicalEdu_marks;
	}



	public void setIsExamAttended(boolean isExamAttended)
	{
		this.isExamAttended = isExamAttended;
	}



	public void setAverage(double average)
	{
		this.average = average;
	}
	



	public String getStudent_name() 
	{
		return student_name;
	}



	public int getStudent_rollNo() 
	{
		return student_rollNo;
	}



	public double getMath_Marks()
	{
		return math_Marks;
	}



	public double getPhysics_Marks() {
		return physics_Marks;
	}



	public double getChemistry_marks() {
		return chemistry_marks;
	}



	public double getEnglish_marks() {
		return english_marks;
	}



	public double getPhysicalEdu_marks() {
		return physicalEdu_marks;
	}



	public boolean isExamAttended() {
		return isExamAttended;
	}



	public double getAverage() {
		return average;
	}



	public double getResult()
	{
		if(examAttended())
		{
		average = (math_Marks+physics_Marks+chemistry_marks+english_marks+physicalEdu_marks)/5;
		}
		else {
			average=0.0;
		}
		return average;
		
	}
	public boolean examAttended()
	{
		return isExamAttended;
	}



	



	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_rollNo=" + student_rollNo + ", math_Marks="
				+ math_Marks + ", physics_Marks=" + physics_Marks + ", chemistry_marks=" + chemistry_marks
				+ ", english_marks=" + english_marks + ", physicalEdu_marks=" + physicalEdu_marks + ", isExamAttended="
				+ isExamAttended + ", average=" + getResult() + "]";
	}
	

}
