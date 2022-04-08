class ContinueDemo{
	public static void main(String[] args) {
			int count=0;
			for(int i=65;i<=122;i++){

				if(i>90 && i<97)
					continue;
                System.out.print((char)i+" ");

                count++;
                if(count%13==0)
                System.out.println();

			}

			 System.out.println();

	}
}