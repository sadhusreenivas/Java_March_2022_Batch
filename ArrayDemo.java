public class ArrayDemo{
	
	public static void main(String[] args) {
		
		int[] arr=new int[10];

		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100); 
		}
       
       for(int x:arr)
       	System.out.println(x);

       int min=arr[0];
       int max=arr[0];

       for(int i=0;i<arr.length;i++){
       if(arr[i]<min)
       	min=arr[i];

       if(arr[i]>max)
       	max=arr[i];
       
   }
       System.out.println("MIN: "+min+"\nMax: "+max);
	
}
}