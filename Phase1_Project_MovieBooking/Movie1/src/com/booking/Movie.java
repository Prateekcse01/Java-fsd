package com.booking;

import java.util.*;

public class Movie{
	private String name;
	private String theatername;
	private int numofticket;
	private int cost;

	Movie(){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name of the movie:");
		this.name = scn.nextLine();
		System.out.println("Enter the theater name:");
		this.theatername = scn.nextLine();
		System.out.println("Enter the number of tickets");
		this.numofticket = scn.nextInt();
		System.out.println("Enter the cost of tickets");
		this.cost = scn.nextInt();
	}

	 String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 String getTheatername() {
		return theatername;
	}

	void setTheatername(String theatername) {
		this.theatername = theatername;
	}

    int getNumofticket() {
		return numofticket;
	}

    void setNumofticket(int numofticket) {
		this.numofticket = numofticket;
	}

    int getCost() {
		return cost;
	}

    void setCost(int cost) {
		this.cost = cost;
	}

	void storeAllDetails(String name, String brand, int memory, int camera, double price) {
		this.name = name;
		this.theatername = theatername;
		this.numofticket = numofticket;
		this.cost = cost;

	}

	void viewAllDetails() {
		System.out.println("Name of movie:" + name);
		System.out.println("Theater Name:" + theatername);
		System.out.println("Number of tickets:" + numofticket);
		System.out.println("Cost of tickets:" + cost);

	}

}
