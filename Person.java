interface Person{

 void eat(); // 
 void speak(); //

public static void main(String[] args) {
		
	Person p=new Person(){ // implements Person
			//body of Anonymous Inner class
			@Override
			public void eat(){
				System.out.println("Nice Guava!!");
			}
			@Override
			public void speak(){
			System.out.println("English!");	
			}
	}; // AI end

        p.eat();	
        p.speak();

	} // main end

} // class end
