public class SBI extends ATM{ // implement all abstract 
    // disp() 
    @Override
	void withdraw(){
		System.out.println("Withdrawn successfully!");
	}

    void deposit(){
    	System.out.println("deposited successfully!");
    }
	
	void getSBI(){
		System.out.println("This is SBI BANk ATM...!");
	}

   public static void main(String[] args) {
   	
   	ATM a=new SBI(); // upcasting 
   	a.disp();
   	a.withdraw();
   	a.deposit();
   	
    SBI s=new SBI();
   	s.getSBI(); // CE
   }

} 