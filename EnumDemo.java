enum Day{
 MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class EnumDemo{

 public static void main(String[] args) {
 		
 		Day[] d=Day.values(); // values ---

 		for(Day d1:d)
 			System.out.println(d1);
 	}	
}
