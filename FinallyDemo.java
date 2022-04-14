public class FinallyDemo{

	public static void main(String[] args) {
		
		int[] arr=new int[5];

		try{
		for(int i=0;i<=5;i++)
		{
         arr[i]=i*i; // 0 1 4 9 16 .....i=5 ..25
		}

       } // try
       finally{
       System.out.println("Finally is always gets executed!!");
       }

       System.out.println("Rest of code.....follows!!");

	}
	
}