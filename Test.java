public class Test{ // starting point of application
	public static void main(String[] args) { 

	   Address a1=new Address("114","Dream Valley Road","MNK","Hyd","TS","INDIA",500005);
	   	
	   Student s1=new Student(111,"ABC",89,87,67,"DAC","Female",a1);
       s1.disp();
       s1.findAvg();
       
       Address a2=new Address("204","MG Road","MNK","Hyd","TS","INDIA",500005);

       Student s2=new Student(111,"ABC",89,87,67,"DASSD","Male",a2);
       s2.disp();
       s2.findAvg();
	}
	}