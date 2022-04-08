import java.util.Scanner;
class Area{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter radius");
int r=in.nextInt();
final double PI=3.14;
double area=PI*r*r;	
System.out.println("Area of a circle:"+area);
	}	
	
}