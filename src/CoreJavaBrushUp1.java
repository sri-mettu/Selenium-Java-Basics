public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data types
		
		int myNum = 7;
		String webSite = "10.1.110.51";
		char letter ='r';
		double dec = 4.77;
		boolean myCard = true;
		
		System.out.println(myNum+"is the value");//concatenation
		
		//Arrays - Store multiple values
		int[] value = new int[5]; //Declaring array with memory
		value[0] = 4;
		value[1] = 3;
		value[2] = 7;
		value[3] = 9;
		value[4] = 5;
		
		int[] arr2 = {4,3,7,9,5,10,12,18,20}; //another syntax for array
		
		System.out.println(arr2[3]);
		
		//for loop
		
		for(int i = 0; i<arr2.length; i++)
		{
		
			System.out.println(arr2[i]);
		}
		
	
		for(int i = 0; i<value.length; i++)
		{
		
			System.out.println(value[i]);
		}
		
		String[] name = {"sri","mallik","arjuna","mettu"};
		for(int i = name.length - 1; i >= 0; i--)
		{
			System.out.println(name[i]);
		}
		
		//Enhanced for loop
		for( String n: name)
		{
			System.out.println(n);
		}
		
		for( int i: arr2)
		{
			System.out.println(i);
		}

	}

}
