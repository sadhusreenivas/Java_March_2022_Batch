public class HDFC implements RBI{
	double amount=12345;

	public void withdraw(){
      System.out.println("withdraw success!");
	} 
	public void deposit(){
      System.out.println("deposit success!");
	}
	public void transfer(){
      System.out.println("transfer success!");
	}

	void disp(){
		System.out.println("Im HDFC Bank!");
		double si=amount*interestRate*1/100;
		System.out.println(si);
	}

    public static void main(String[] args) {
    	RBI r=new HDFC();
    	r.withdraw();
    	r.deposit();
    	r.transfer();
    	HDFC h=new HDFC();
    	h.disp();
    
}
}