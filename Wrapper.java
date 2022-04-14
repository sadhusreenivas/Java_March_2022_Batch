public class Wrapper{
	
	public static void main(String[] args) {
		
		Integer x=123;
		Integer y=321;
        
        Double d=23.24;
		System.out.println(x+y); // 10.0
		//System.out.println(x.doubleValue());

		int z=x; // unboxing
		System.out.println(z);
	}
}