class PrimeDemo{
	
	public static void main(String[] args) {
		
     int n=Integer.parseInt(args[0]);
     int i=1,count=0;

     while(i<=n/2){

     	if(n%i==0){
         count++; // factors count
         
         if(count>1)
         	break; //
     	}
     	i++;

     }
     if(count==1)
     	System.out.println(n+ "is prime");
     else
     	System.out.println(n+ "is not prime");
     
     System.out.println("The loop executed for "+i+" times");

	}
}