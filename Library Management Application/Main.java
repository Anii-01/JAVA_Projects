package com.pvpit;

import java.util.*;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		//Hibernate COnfiguration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating object
		Book b = new Book();
		
		
		//FOR ADDING DATA INTO DATABASE!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------WELCOME TO THE BOOKS MANAGEMENT APPLICATION!!--------");
		System.out.println();
		System.out.println(" ENTER THE CHOICE : \n For Add More Books : Enter 1 \n For Exit the Application : Enter 0 ");
		int choice = sc.nextInt();
		int ch2;
		if(choice==1){
			do{
			
		System.out.println("ENTER THE BOOK ID: ");
		int ID = sc.nextInt();
		b.setBookId(ID);
		
		sc.nextLine();
		System.out.println("ENTER THE BOOK NAME: ");
		String NAME = sc.nextLine();
		b.setName(NAME);
		
		System.out.println("ENTER THE BOOK AUTHOR NAME: ");
		String AUTHOR = sc.nextLine();
		b.setAuthor(AUTHOR);
		
		System.out.println("ENTER THE BOOK PRICE: ");
		int PRICE = sc.nextInt();
		b.setPrice(PRICE);
		
		System.out.println(b);
		System.out.println("BOOK ADDED SUCESSFULLY!!");
		System.out.println();
		
		System.out.println("DO YOU WANT TO CONTINUE..?");
		System.out.println(" ENTER THE CHOICE : \n For YES : Enter 1 \n For NO : Enter 0 ");
		ch2 = sc.nextInt();
		
			}while(ch2==1);
			System.out.println("THANKS FOR USING APPLICATION!!");
		
		}
		
		else {
			System.out.println("THANKS FOR USING APPLICATION!!");
		}
	
		
		//session is interface
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(b);
		transaction.commit();
		session.close();
			
		
	}

}
