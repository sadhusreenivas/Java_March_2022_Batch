public class Customer{
	private int CustID;
    private String CustName;
    private double CustBalance;
    private String CustCity;
    static String CustBank="State Bank of India";
   
    //Parameterised Cuntsructor to initialize data members of Superclass Customer
    public Customer(int CustID, String CustName, double CustBalance, String CustCity){
        this.CustID=CustID;
        this.CustName=CustName;
        this.CustBalance=CustBalance;
        this.CustCity=CustCity;
    }

    //overriding toString() - eliminaate the need of getter method 
    public String toString(){
    	return CustID+"\n"+CustName+"\n"+CustBalance+"\n"+CustCity+"\n"+CustBank;
    }
    

    public static void main(String[] args) {
    	Customer c1=new Customer(111,"ABC",50000,"Hyderabad");
    	Customer c2=new Customer(101,"XYZ",150000,"Pune");

    	System.out.println(c1); // c1.toString() - Object - java.lang
    	System.out.println(c2);
    	 
    }
}