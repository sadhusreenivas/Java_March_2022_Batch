public strictfp class MainDemo{
	
static void add(int... arr){ // implicitly becomes an array
	int sum=0;
    for(int i:arr)
    	sum=sum+i;

	System.out.println(sum);
}	

synchronized final static public void main(String... args) {

	add(123,321);
	add(123,321,456);
	add(12,34,56,78,98);
	add(1,2,3,4,5,6,7);
	add(12,45,67,8,9,3,4,6,8,9,2,4,11,56,78,99);
}

}



// var args - variable arguments 