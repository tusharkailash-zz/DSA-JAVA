package design;


/*
Design a simple parking lot system with "programmable floors and no of spots" in each floor
eg:

4 floors and 10 spots on each floor in a straigh light like an array...
  floor 4 : [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10]
  floor 3 : [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10]
  floor 2 : [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10]
  floor 1 : [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10]
  
  
(no need to program it such that it will accept variable number of spots on each floor)
fr eg : floor 1 has 10 spots but floor 2 can have 15 (Not a requirement)
your task is to: keep a track of occupied and available spot count per floor.
after designing your system, write functions from driver method:
1. create customer with id:
2. park(): parks and gives a ticket to user, i.e., assigns floorid_spotId to user/customer class: 1-3 (1st floor 3 rd spot)
  so this is how customer gets to know where he should go and park correct?
3. leave(): makes location available
4 statistics(): this will print floor wise slots which are booked and available

"create 10 customers, park 5 of them print statistics and park other 5 and print statistics and leave 5 and print stats"

no need to worry about parking cost :-P that would be part 2 if you perform well in this :-P
*/
import java.io.*;
import java.util.*;

class Floors {
	boolean[] spots;

	public Floors(int num_of_spots) {
		this.spots = new boolean[num_of_spots];
	}
}

class Customer {
	int customer_id;
	String park_pos;

	public Customer(int id) {
		this.customer_id = id;
	}
}

class ParkingDesign {

	public static void park(List<Floors> listOfFloors, Customer c) {

		for (int i = 0; i < listOfFloors.size(); i++) {

			for (int j = 0; j < listOfFloors.get(i).spots.length; j++) {

				if (listOfFloors.get(i).spots[j] == false) {

					c.park_pos = i + "_" + j;

					listOfFloors.get(i).spots[j] = true;
					System.out.print(c.park_pos + " ");
					return;
				}
			}
		}
	}

	public static void statistics(List<Floors> listOfFloors) {
		System.out.println("Available parking places: \n");
		for (int i = listOfFloors.size() - 1; i >= 0; i--) {
			System.out.print("Floor: " + i + "\t");
			for (int j = 0; j < listOfFloors.get(i).spots.length; j++) {

				if (listOfFloors.get(i).spots[j] == true) {

					System.out.print("*" + "  ");
				} else {
					System.out.print("A" + "  ");
				}

			}
			System.out.println();
			//

		}
	}
	
	private static void leave(Customer c, List<Floors> listOfFloors) {
		
		String[] leaving_customers = c.park_pos.split("_");
		int floor_id = Integer.parseInt(leaving_customers[0]);
		int spot_id =  Integer.parseInt(leaving_customers[1]);
		
		
		listOfFloors.get(floor_id).spots[spot_id] = false;   //Customer 4 from floor 0 leaving
		statistics(listOfFloors);   //to again print the availability
	}

	public static void main(String[] args) {

		List<Customer> listOfCustomers = new ArrayList<>();
		for (int i = 1; i <= 25; i++) {
			Customer c = new Customer(i);
			listOfCustomers.add(c);
		}

		int numberOFfloor = 5;
		int numOfSpots = 10;

		List<Floors> listOfFloors = new ArrayList<>();
		for (int i = 1; i <= numberOFfloor; i++) {
			Floors f = new Floors(numOfSpots);
			listOfFloors.add(f);
		}

		for (int i = 0; i < 25; i++) {
			park(listOfFloors, listOfCustomers.get(i));

		}
		System.out.println("\n");
		
		statistics(listOfFloors);
		leave(listOfCustomers.get(4),listOfFloors);
		
	}

	
}