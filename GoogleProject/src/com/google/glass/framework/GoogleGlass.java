package com.google.glass.framework;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GoogleGlass {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int a = 1;
		int b = 3;
		
		System.out.println(a+b);
		
//		    Runtime rs = Runtime.getRuntime();
//		 
//		    try {
//		      rs.exec("Music");
//		    }
//		    catch (IOException e) {
//		      System.out.println(e);
//		    }   
		  
		//System.out.println(InetAddress.getLocalHost());
		      char ch;
		 
		      for( ch = 'a' ; ch <= 'z' ; ch++ )
		         System.out.println(ch);
		      
		      
		      int n, c;
		      System.out.println("Enter an integer to print it's multiplication table");
		      Scanner in = new Scanner(System.in);
		      n = in.nextInt();
		      System.out.println("Multiplication table of "+n+" is :-");
		 
		      for ( c = 1 ; c <= 10 ; c++ )
		         System.out.println(n+"*"+c+" = "+(n*c));
		   }
	
	
	
		}

