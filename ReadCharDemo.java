class ReadCharDemo{
	public static void main(String[] args) {
		java.util.Scanner in=new java.util.Scanner(System.in);
		System.out.println("Enter a char");
		String str=in.next();
		char ch=str.charAt(0); // charAt - read characters  char by char
		System.out.println(ch);
	}
}