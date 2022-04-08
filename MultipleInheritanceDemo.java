interface Printable{
	void print();
}

interface Showable{
	void show();
}

class X implements Printable, Showable{ // multiple inheritance with interfaces
	public void print(){
     System.out.println("Printing!!!");
	}

	public void show(){
     System.out.println("Showing!!!");
	}
}

public class MultipleInheritanceDemo{
	public static void main(String[] args) {
		X x1=new X();
		x1.print();
		x1.show();
	}
}