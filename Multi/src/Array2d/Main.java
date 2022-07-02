package Array2d;

public class Main {

	public static void main(String[] args) {
		
		int array[][] = {
				{100,200,300,400,500,600}, //first array
				{1,2}//second array 
		};
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		System.out.println(array[0][2]);
//		System.out.println(array[0][3]);
//		System.out.println(array[0][4]);
//		System.out.println(array[0][5]);
//		
//		System.out.println(array[1][0]);
//		System.out.println(array[1][1]);
		
		
		//print the sum of each row in an array
//		int i,j;
//		int sum=0;
//		for(i=0;i<array[i].length;i++) {
//			for(j=0;j<array[i].length;j++) {
//				sum= sum+array[i][j];
//			}
//			System.out.println("The sum of the row "+(i+1) +" is:"+sum);
//			sum=0;
//		}
		
		
		
		//print the max of each row in an array
		
		int i,j,max = 0;
		
		//System.out.println(max);
		for(i=0;i<array[i].length;i++) {
			for(j=0;j<array[i].length;j++) {
				max=array[i][0];
				if(max<array[i][j]) {
					max=array[i][j];
				}
			}
			System.out.println("The maximum of the row "+(i+1)+" is: "+max);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
