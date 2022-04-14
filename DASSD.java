package cdac.hyd;

public class DASSD{
	int strength=28;
	
	public void getTotal(){
		System.out.println("PG DASSD - strength:"+strength);
	}

	public static void main(String[] args) {
		DASSD d1=new DASSD();
		d1.getTotal();
	}
}
