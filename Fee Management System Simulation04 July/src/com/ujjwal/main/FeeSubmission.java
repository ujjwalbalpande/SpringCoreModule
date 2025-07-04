package com.ujjwal.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ujjwal.sbean.DayScholar;
import com.ujjwal.sbean.Hosteller;

public class FeeSubmission 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com\\ujjwal\\cfg\\ApplicationContext.xml");

        // Load DayScholars
        DayScholar[] dayScholars = {
            (DayScholar) context.getBean("s1"),
            (DayScholar) context.getBean("s2"),
            (DayScholar) context.getBean("s3")
        };

        for (DayScholar student : dayScholars) {
            double result = student.payFee();

            if (result > 0) {
                System.out.println("Refund amount of Rs.");
                System.out.println("Rs. " + result);
            } else if (result < 0) {
                System.out.println("have to pay more amount of Rs.");
                System.out.println("Rs. " + Math.abs(result));
            } else {
                System.out.println("All due clear !!");
            }

            System.out.println(student.displayDetails());
            System.out.println("--------------------------------");
        }

        // Optionally: Load a Hosteller
        Hosteller hosteller = (Hosteller) context.getBean("h1");
        double result = hosteller.payFee();
        if (result > 0) {
            System.out.println("Refund amount of Rs.");
            System.out.println("Rs. " + result);
        } else if (result < 0) {
            System.out.println("have to pay more amount of Rs.");
            System.out.println("Rs. " + Math.abs(result));
        } else {
            System.out.println("All due clear !!");
        }
        System.out.println(hosteller.displayDetails());
        System.out.println("--------------------------------");
    }
}
