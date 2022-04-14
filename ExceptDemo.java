package exceptions;
import java.io.*;

public class ExceptDemo{
	
public static void main(String[] args) throws IOException {
   
// read name and age of a person
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //

System.out.println("Enter name");
String name=br.readLine(); // reads a line of text
System.out.println("Enter Age");
int age=Integer.parseInt(br.readLine()); // "20" - 20

System.out.println(name+" "+age);

}

}