package cdac.hyd;

public class PGDAC{
	int strength=140;

	public void getTotal(){
		System.out.println("PG DAC - strength:"+strength);
	}

	public static void main(String[] args) {
		PGDAC d1=new PGDAC();
		d1.getTotal();
	}
}


//complilation:  javac -d . PGDAC.java

// run : java cdac.hyd.PGDAC
