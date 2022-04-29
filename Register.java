package staticapplication;

import java.util.Scanner;
public class Register {
  String name;
  String phonenumber;
 public  void naming() {
	 try {
	 System.out.println("Please enter the name");
	 Scanner scan=new Scanner(System.in);
	 String string=scan.nextLine();
	if(string.matches("[a-zA-Z]+")) { 
	Validation valid=new Validation();
	valid.setName(string);
	System.out.println("Enter name    :"+string);
	}
	else {
		throw new InValidInput();
	}
	 }
	catch(InValidInput e) {
		System.out.println("If you want visit enter the correct name ");
		naming();
	}
	 }
     public  void phoneDetail() {
	 System.out.println("Please enter phone number");
	 Scanner scan=new Scanner(System.in);
	 try {
	 String phone=scan.next();
	 if(phone.matches("\\d{10}")) {
	 Validation valid=new Validation();
	 valid.setPhonenumber(phone);
	 System.out.println("Enter phone number    :"+phone);
	 }
	 else {
		 throw new InValidInput();
	 }
	 }
	 catch(InValidInput e) {
		 System.out.println("If you want visit  enter the correct  phone number");
		 phoneDetail();
	 }
 }
public void registration() {
	// TODO Auto-generated method stub
	 naming();
	 phoneDetail();
	// Slots s=new Slots();
	// s.display();
	 CasesOfChoice c3=new CasesOfChoice();
	 c3.enter();
}
}
