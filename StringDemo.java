public class StringDemo{

public static void main(String[] args) {
		
		String s="Sachin";
		s.concat(" Tendulkar");

		System.out.println(s); // immutable

		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" Java");
		System.out.println(sb);// mutable
        
        String str="Hello"+" Java"; //// Hello Java
        System.out.println(str);

        String s1=new StringBuffer().append("Hello").append(" Java").toString();
        System.out.println(s1);

        String s2=new StringBuilder().append("Hello").append(" Java").toString();
        System.out.println(s2);

        String s4=50+30+"Sachin"+40+60; // 80Sachin4060
         System.out.println(s4);
	}	
}

// +  two number = arithmetic 80+"Sachin"