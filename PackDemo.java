
import java.time.*; // implicit import

public class PackDemo{
	
	public static void main(String[] args) {
		java.util.Date d=new java.util.Date(); // util - FQN
        System.out.println(d);

        LocalDate date=LocalDate.now();
        System.out.println(date);

        Date myDate=new Date();
        myDate.getDate(); //  class path
	}

}