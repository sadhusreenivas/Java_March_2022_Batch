class Circle{
	private double radius;

	Circle(){
    java.util.Scanner in=new java.util.Scanner(System.in);//FQN
    System.out.println("Enter radius");
    radius=in.nextDouble();
	}

	void findArea(){
        final double PI=3.14;
		double area=PI*radius*radius;
	    System.out.println("Area: "+ area);
	}

}