public class LocalDemo{

 private int version=18;

 public void display(){ // method - defining class 
 
 class Local{ // local inner 
 	String name="Java";
 	
 	void msg(){
 		System.out.println(name+" "+version);
 	}
 } // local end
   
 Local l=new Local();
 l.msg();
 
 } // display method end
	
public static void main(String[] args) {
 
LocalDemo ld=new LocalDemo();
ld.display();

}

}