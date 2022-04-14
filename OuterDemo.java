public class OuterDemo{

	private int data=99; // instance

	class Inner{ // non-static 
    String name="Java";
    
    void msg(){
    	System.out.println(data+" "+name);
    }
	} // inner end
	
	void display(){ // Outer class method
        // msg()
        Inner in=new Inner();
        in.msg();
	}

	public static void main(String[] args) {
		
		OuterDemo out=new OuterDemo(); 
		out.display(); // msg()
        

	}
}