enum Days{
	SUN,MON,TUE,WED,THU,FRI,SAT;
}
class EnumTest{

	public static void main(String[] args) {
		

	Days[] d=Days.values();

	for(Days d1:d){
    System.out.println(d1);
	}

}
}