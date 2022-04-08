class Factorial{
	
	void fact(int n){
		long f=1;
		for(int i=1;i<=n;i++)
			f=f*i;

		System.out.println(f);

		System.out.println(this); // f1 - object refence
	}

	public static void main(String[] args) {
		
		Factorial f1=new Factorial();
		f1.fact(9); //
		System.out.println(f1); // object reference 

		Factorial f2=new Factorial();
		f2.fact(11); //
		System.out.println(f2); // object reference 
		
	}
}