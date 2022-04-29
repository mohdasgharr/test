package staticapplication;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketSlot {
	public void cricket() {
		System.out.println("You are choosing cricket avalable slot are here");
LinkedHashMap <Integer,String> hs=new LinkedHashMap<>();
hs.put(1,"10:00AM - 12:00PM");
hs.put(2,"12:00AM - 2:00PM");
hs.put(3,"2:00AM - 4:00PM");
hs.put(4,"4:00AM - 6:00PM");
hs.put(5,"6:00AM - 8:00PM");
for(Map.Entry s:hs.entrySet()){
	System.out.println(s);
	}

    System.out.println("Enter the appropriate key to book time slot");
     Scanner scanner = new Scanner(System.in);

     try {
	 int c = scanner.nextInt();
	 if (c<= 5 && c>0) {
		System.out.println("Thanks for booking");
		System.out.println("Your booking details are :" +hs.get(c));
		hs.remove(c);
		
		               }
	else {
		System.out.println("Sorry you are entering wrong slot");
	   cricket();
	    }
        } 
     catch (Exception e) {
	System.out.println("please enter the existing number in list");
	cricket();
                         }
    System.out.println("if you want to continue with same cricket press 1 or enter 2 to main page or enter any key to exit ");
    try {
	int i = scanner.nextInt();
	if (i == 1) {
		for(Map.Entry s:hs.entrySet()) {
			System.out.println(s);
		}
	}
	
	if (i == 2) {
		CasesOfChoice c2=new CasesOfChoice();
		c2.enter();
	}
	else
	{
		System.out.println("thank you");
	}
}
   catch (Exception e) {
	System.out.println("Thanks for the visiting in complex have a good day day:");
}

}

}