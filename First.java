public class First{
	public static void main(String[] args){ //2 3 4 5
	 	int m1=Integer.parseInt(args[0]);
	 	int m2=Integer.parseInt(args[1]);
	 	int m3=Integer.parseInt(args[2]);

	 	if(m1>100 || m2>100 || m3>100){
	 		System.out.println("Invalid Marks1");
	 		return;
	 	}
	    int per=(m1+m2+m3)/3;
	    System.out.println(per);
        switch(per/10){ // 0 -10
        case 0:
        case 1:
        case 2:
        case 3: System.out.println("Fail");
               break;
        case 4:System.out.println("Third");
               break;
        case 5:System.out.println("Second");
               break;
        case 6:System.out.println("First");
               break;
        case 7:
        case 8:
        case 9:System.out.println("Distinction");
               break;
         default: System.out.println("Please enter proper marks!");    
        }
    }
}
       


