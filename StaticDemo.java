public class StaticDemo{
	static int count; //0 retain its value

    public StaticDemo(){
    	count++;
    	System.out.println(count);
    }
	public static void main(String[] args) {
		
		StaticDemo d1=new StaticDemo();
		StaticDemo d2=new StaticDemo();
		StaticDemo d3=new StaticDemo();
	}
}

//