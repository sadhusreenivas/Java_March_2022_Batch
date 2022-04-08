public class TwoDArray{
	public static void main(String[] args) {

		int[][] matrix1=new int[3][3];
		int[][] matrix2=new int[3][3];
		int[][] matrix3=new int[3][3];

        // reading values to the array using random() - m1
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix1[i][j]=1+(int)(Math.random()*9); // range 
			}
		}
      // reading values to the array using random() - m2
        for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix2[i][j]=1+(int)(Math.random()*9);
			}
		}

        // printing array elements - m1
        for(int i=0;i<3;i++){
        	System.out.println();
			for(int j=0;j<3;j++){
				System.out.print(matrix1[i][j]+" "); // print()
		}
	}
	System.out.println();
	 // printing array elements - m1
	for(int i=0;i<3;i++){
        	System.out.println();
			for(int j=0;j<3;j++){
				System.out.print(matrix2[i][j]+" "); // print()
		}
	}

     // matrix addition
     for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
	}
	}
      System.out.println();System.out.println();
      // matrix addition - displaying - m3
	for(int i=0;i<3;i++){
        	System.out.println();
			for(int j=0;j<3;j++){
				System.out.print(matrix3[i][j]+"\t"); // print()
		}
	}
}
}
