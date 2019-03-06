public class Arrays {

	public static void main(String[] args) {

		int[] ages = new int[9];
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
			ages[8] = 50;
			
				System.out.println(ages[ages.length-1] - ages[ages.length-9]);
		
			double sum = 0;
			
			for (int i = 0; i < ages.length; i++) {
				sum += ages[i];	
			}
			
				System.out.println(sum / ages.length);
				
		String[] names = new String[6];
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
			
			double total = 0;
			
			for (int i = 0; i < names.length; i++) {
				total += names[i].length();    
			}
				System.out.println(total / names.length);
	
			for (int i = 0; i < names.length; i++) {
				System.out.print(names[i] + " ");
			}
			
		
				//THESE ARE MY METHODS BELOW THIS LINE
			
			
	}
			public static String Hello(String str , int num) {
				String result = "";
				for (int i=0 ; i < num ; i++) {
					result += str;
				}
					return result;
			}

			public static String createFullName(String Firstname , String Lastname) {
				return Firstname + " " + Lastname;
			}
			
			public static boolean SumOfIntArray(int[] numbers) {
				int sum = 0;
				for(int number : numbers) {
					sum += number;
				}
				if( sum > 100) {	
					return true;
				} else
					return false;
			}
			
			public static double AverageOfArray(double[] array) {
				double sum = 0;
				for(int i=0 ; i < array.length ; i++) {
					sum += array[i];
				}
				double result = sum / array.length;
				
				return result;
			}
			
			public static boolean AverageOfDoubleArray(double[] array1 , double[] array2) {
				double sum1 = 0;
				double sum2 = 0;
				double average1 = 0;
				double average2 = 0;
				for(int i=0 ; i < array1.length ; i++) {
					sum1 += array1[i];
					average1 = sum1 / array1.length;
				}
				for(int i=0 ; i < array2.length ; i++) {
					sum2 += array2[i];
					average2 = sum2 / array2.length;
				}
					if( average1 > average2) {	
						return true;
					}else
						return false;
			}
			
			public static boolean willBuyDrink(double Money , boolean temperature) {
				if (temperature == true && Money > 10.50) {
					return true;
				}else 
					return false;
			}
}


