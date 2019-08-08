package com.demo.Assignment1;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static String empName;
	 public static int empAge;
	 public static float amount;
    public static void main( String[] args )
    {
    	 Scanner scan = new Scanner(System.in);
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	 System.out.println("Choose the designation: ");
    	 System.out.println("1.Clerk");
    	 System.out.println("2.Programmer");
    	 System.out.println("3.Manager");
    	 String ch;
    	 System.out.println("Select your option:");
    	 ch=scan.next();
    	 System.out.println("Enter the name and age: ");
    	 empName = scan.next();
    	 empAge = scan.nextInt();
    	 switch (ch) {
    	 case "1":{
    		 Clerk c=(Clerk) context.getBean("cl");
    		 System.out.println(c);
    		 System.out.println("Raise salary of clerk: ");
    		 amount = scan.nextFloat();
    		 Clerk h=(Clerk) context.getBean("cl");
    		 System.out.println(h);
    		 break;
    	 }
    	 case "2":{
    		 Programmer c=(Programmer) context.getBean("pr");
    		 System.out.println(c);
    		 break;
    	 }
    	 case "3":{
    		 Manager c=(Manager) context.getBean("mg");
    		 System.out.println(c);
    		 break;
    	 }
    	 default:{
    		 System.out.println("try"); 
    	 }
    	 }

    	 context.close();
    }
}
