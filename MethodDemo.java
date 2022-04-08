public class MethodDemo{
	
	

	public static void main(String[] args) {
		
		System.out.println(sum(1,10)); // method calls - actual arguments 
        System.out.println(sum(100,150));
		
		int res1=sum(1000,1500);
		System.out.println(res1);

        int res2=MethodDemo.sum(1234,5432); 
        System.out.println(res2);  
 	
	}

	public static int sum(int x, int y){  // method definition - formal arguments
		int sum=0;
		for(int i=x;i<=y;i++)
			sum=sum+i;
       
        return sum;
	}
}