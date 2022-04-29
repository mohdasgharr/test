package staticapplication;

public class Slots {
public void display() {
	CasesOfChoice c=new CasesOfChoice();
	c.lh.put(1, "10:00  AM  -  11:00  AM");
	c.lh.put(2, "11:00  AM  - 12:00  PM");
	c.lh.put(3, "12:00  PM  - 1:00  PM");
	c.lh.put(4, "1:00  AM  - 2:00  PM");
	c.lh.put(5, "2:00  AM  - 3:00  PM");
	c.lh.put(6, "3:00  AM  - 4:00  PM");
	c.lh.put(7, "4:00  AM  - 5:00  PM");
	c.lh.put(8, "5:00  AM  - 6:00  PM");
	c.lh.put(9, "6:00  AM  - 7:00  PM");
	c.lh.put(10, "7:00  AM  - 8:00  PM");
	
	c.lh1.put(1, "8:00 AM - 8:30 AM");
	c.lh1.put(2, "8:30 AM - 9:00 AM");
	c.lh1.put(3, "9:00 AM - 9:30 AM");
	c.lh1.put(4, "9:30 AM - 10:00 AM");
	c.lh1.put(5, "10:00 AM - 10:30 AM");
	c.lh1.put(6, "10:30 AM - 11:00 AM");
	
	c.hs.put(1,"10:00AM - 12:00PM");
	c.hs.put(2,"12:00AM - 2:00PM");
	c.hs.put(3,"2:00AM - 4:00PM");
	c.hs.put(4,"4:00AM - 6:00PM");
	c.hs.put(5,"6:00AM - 8:00PM");
	c.enter();
}
}
