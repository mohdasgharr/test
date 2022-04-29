package staticapplication;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BadmintonSlot {
	public void badminton() {
		System.out.println("You are choosing badminton slot avalable slot are here");
		LinkedHashMap <Integer, String> lh=new LinkedHashMap<>();
		lh.put(1, "10:00  AM  -  11:00  AM");
		lh.put(2, "11:00  AM  - 12:00  PM");
     	lh.put(3, "12:00  PM  - 1:00  PM");
		lh.put(4, "1:00  AM  - 2:00  PM");
		lh.put(5, "2:00  AM  - 3:00  PM");
		lh.put(6, "3:00  AM  - 4:00  PM");
		lh.put(7, "4:00  AM  - 5:00  PM");
		lh.put(8, "5:00  AM  - 6:00  PM");
		lh.put(9, "6:00  AM  - 7:00  PM");
		lh.put(10, "7:00  AM  - 8:00  PM");
		for(Map.Entry m:lh.entrySet()) {
			System.out.println(m);
		}
	System.out.println("Enter the appropriate key");

	try {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a <= 10&&a>0) {
			System.out.println("Thanks for booking");
			System.out.println("Your booking book details :" + lh.get(a));
			lh.remove(a);
		}

		else {
			System.out.println("Sorry !you are entering the wrong slot");
	badminton();
		}
	} catch (Exception e) {
		System.out.println("Please enter the existing number in the list");
		badminton();
	}
	System.out.println("if you want to continue press 1 or enter 2 to go back to main page enter any key to exit ");
	Scanner scanner = new Scanner(System.in);

	try {
		int i = scanner.nextInt();
		if (i == 1) {
			for(Map.Entry m:lh.entrySet()) {
				System.out.println(m);}

		}
		if (i == 2) {
			CasesOfChoice c=new CasesOfChoice();
			c.enter();
		}
		else
		{
			System.out.println("thank you");
		}
	} catch (Exception e) {
		System.out.println("thanks for the visiting have a nice day:");
	}

}}

