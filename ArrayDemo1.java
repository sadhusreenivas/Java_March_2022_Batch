public class ArrayDemo1{
	
	public static void main(String[] args) {
		
	String[] languages={"Java","C","Python","Javascript","C#","XML","SQL","HTML5"};
	
	for(String x:languages)
	System.out.println(x);

    java.util.Arrays.sort(languages); // FQN

    System.out.println("Sorted Order...");
	for(String x:languages)
	System.out.println(x);
}
}