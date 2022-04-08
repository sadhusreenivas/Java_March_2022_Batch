interface Sample{

default void sayHello(){
	System.out.println("Hello Java!!");
	sayHi();
}

private void sayHi(){
	System.out.println("Hi Java!!");
}

static void welcome(){
 	System.out.println("Welcome Java!!");
}

void hello(); // abstract method
}

public class InterfaceDemo implements Sample{
public void hello(){
	System.out.println("Hello World!!");
}

public static void main(String[] args) {
	InterfaceDemo id=new InterfaceDemo();
	id.hello();
	id.sayHello(); // sayHi();
    Sample.welcome();	
}

} 



