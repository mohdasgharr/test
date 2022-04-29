package staticapplication;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CasesOfChoice
{
	  Map<Integer, String> lh = new HashMap<Integer, String>();
	  Map<Integer, String> lh1= new HashMap<Integer, String>();
		Map<Integer, String> hs = new HashMap<Integer, String>();
		public void enter() {
			System.out.println("Welcome in sports complex ");

			System.out.println("Enter the number as of your choice");

			System.out.println("1.badminton");
			System.out.println("2.footbal");
			System.out.println("3.cricket");
			Scanner scanner = new Scanner(System.in);
			try {
				int option = scanner.nextInt();
				if (option > 0 && option <=3) {
					switch (option) {
					case 1:
						BadmintonSlot b=new BadmintonSlot();
						b.badminton();
						break;
					case 2:
						FootbalSlot f=new FootbalSlot();
						f.footbal();
						break;
					case 3:
						CricketSlot c=new CricketSlot();
						c.cricket();
						break;
					    default:
						System.out.println("error");
					              }
				    }
				else {
					System.out.println("enter appropriate number only");
					enter();
				     }
			    } 
			   catch (Exception e) {

				System.out.println("please enter appropriate number");
			    enter();
			                    }
		}
		public void footbal() {
			System.out.println("You are choosing football avalaible slot are here");
		LinkedHashMap <Integer,String> lh1=new LinkedHashMap<>();
		for(Map.Entry k:lh1.entrySet()) 
	    {
		System.out.println(k);
		}
		
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the time slot for football");
	    int b=scan.nextInt();
	    if(b<=6&&b>0){
	    	System.out.println("Thanks for booking");
	    	System.out.println("booking detail  : "+lh1.get(b));
	     	lh1.remove(b);
	    	for(Map.Entry k:lh1.entrySet()) 
	        {
	    	System.out.println(k);
	    	}
	    }
	    else {
	    	System.out.println("Sorry! this time slot are not available");
	         footbal();
		     }
		}
		 catch (Exception e)
		 {
			System.out.println("Please enter the existing number in the list");
			footbal();
		 }
		 System.out.println("if you want to continue football press 1 or enter 2 to go back to main page enter any key to exit ");
			Scanner scanner = new Scanner(System.in);

			try {
				int i = scanner.nextInt();
				if (i == 1) {
					 for(Map.Entry k:lh1.entrySet()) {
				    	  	System.out.println(k);
				    	 
				    }
				    }
				if (i == 2) {
					CasesOfChoice c1=new CasesOfChoice();
					c1.enter();
				}
				else
				{
					System.out.println("Thank you");
				}
			} catch (Exception e) {
				System.out.println("Thanks for the visiting complex have a nice day:");
			}
		}
		}