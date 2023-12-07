package com.booking;
import java.util.*;
public class Moview{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int status = 1;
		Movie movlist[]= null;
      
		do {
			System.out.println("Wellcome to the cinema hall");
			System.out.println("1. Add movie details");
			System.out.println("2. Search and book");
			System.out.println("3. View all");
			System.out.println("Enter your choice");
			int ch = scn.nextInt();
			switch(ch) {
			
			case 1:  
				   System.out.println("Enter the no. of movies : ");
				   int no = scn.nextInt();
				   movlist  = new Movie[no];
				   for(int i=0; i<movlist.length;i++) {
					   int j=i;
					   System.out.println("Enter movies"+ ++j +"Details");
					   movlist[i]= new Movie();
				   }
				   System.out.println("Data Saved......");
				   break;
			case 2:
				   boolean flag = true;
				   scn.nextLine();
				   System.out.println("Enter the movies name: ");
				   String name = scn.next();
				   for(int i=0; i<movlist.length;i++) {
					   if(movlist[i].getName().equals(name)) {
						   movlist[i].viewAllDetails();
						   flag = true;
						   System.out.println("Would you like to book ticket for this movie");
						   System.out.println("Enter 1 to book and 2 to Exit");
						   int c= scn.nextInt();
						   if(c==1) {
							   System.out.println("Enter the number of tickets");
							   int tick = scn.nextInt();
							   int tc = movlist[i].getCost()*tick;
							   System.out.println("The bill comes upto: "+tc);
							   
						   }else 
							   break;
					   }
					   else 
						   flag= false;
					   
					   }
				   if(flag==false) {
					   System.out.println("Not found : ");
					   break;
				   }	   
				case 3 :  
					    for(int i=0; i<movlist.length;i++) {
					    	movlist[i].viewAllDetails();
					    	
					    }
			    default :System.out.println("Wrong choice : ");
			    
				   }
				   
				   
				   System.out.println("Do you want to continue  (1.Y/1.N ) ");
				   status = scn.nextInt();
			}
			while(status==1);
				System.out.println("Excution completed successfully");
		
	}		   
	}
