package exceptions;

import java.util.Scanner;

class ExceptionDemo{
	
	public static void main(String[] args) {
   
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number:");
    int x=in.nextInt(); // read a number - int
    System.out.println("Enter a number:");
    int y=in.nextInt(); // read a number - int
   
    System.out.println("Result:"+ x/y); //
     
    //System.out.println("SQRT of  "+number+" is :"+Math.sqrt(number));
    System.out.printf("SQRT of %d is : %.2f\n",x,Math.sqrt(x));

    String name=null;
    name="CDAC HYD";
    System.out.println("Length of String : "+name.length());

}

}