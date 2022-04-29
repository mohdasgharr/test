package staticapplication;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FootbalSlot {
	public void footbal() {
		System.out.println("You are choosing football avalaible slot are here");
	LinkedHashMap <Integer,String> lh1=new LinkedHashMap<>();
	lh1.put(1, "8:00 AM - 8:30 AM");
    lh1.put(2, "8:30 AM - 9:00 AM");
	lh1.put(3, "9:00 AM - 9:30 AM");
	lh1.put(4, "9:30 AM - 10:00 AM");
	lh1.put(5, "10:00 AM - 10:30 AM");
	lh1.put(6, "10:30 AM - 11:00 AM");
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
      

