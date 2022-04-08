public class X{
	// data members 
   String name; // instance / non -static  - Heap  
   static String org="C-DAC Hyd"; // class / static  - Class Area  /
   //methods 
   // setter or mutator method
   void setName(String n){ // n - local - Stack
   name=n;
   }	
   //getter or accessor method
   void getX(){
   System.out.println(name+"  "+org);
   }

	public static void main(String[] args) {
		X x1,x2,x3; // declaring references

		x1=new X();
		x2=new X();
		x3=new X();
		
		x1.setName("PG-DAC");
		x2.setName("PG-DASSD");
		x3.setName("PG-DESD");

		x1.getX();
		x2.getX();
        x3.getX();
	}
}

// Heap - for objects - non-static data  - instance



