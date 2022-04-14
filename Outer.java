public class Outer{

	private int data=99; // instance

	class Inner{ // non-static 
    String name="Java";
    
    void msg(){
    	System.out.println(data+" "+name);
    }
	} // inner end
	
	public static void main(String[] args) {
		
		Outer out=new Outer(); // 
        Outer.Inner in=out.new Inner();
        in.msg();

	}
}