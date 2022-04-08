// Parent / Base / Super class
  class Employee{
	private int eid;
	private String name;
	protected double basic;
  private static String org="C-DAC Hyd"; 

  protected void setEmployee(int eid, String name,double basic){
  	this.eid=eid;
  	this.name=name;
  	this.basic=basic;
  }

  protected void getEmployee(){
  	System.out.println(eid+ " "+ name+" "+basic+" "+org);
  }

}
