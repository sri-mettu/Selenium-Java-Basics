import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {3,6,9,10,12,18,20};

		int sum = 0;
        
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        
        System.out.println("The sum of the array elements is: " + sum);
    

		for(int i: arr2)
		{
			//if else loop
			
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			else
			{
				System.out.println(i + "not multiple of 2");
				
			}
			
		}
		System.out.println("******************************");
		for(int i = 0; i<arr2.length; i++)
		{
			if(arr2[i] % 3 ==0)
			{
				System.out.println(arr2[i]);
			}
			else 
			{
				System.out.println(arr2[i]+ "not multiple of 3");
			}
			
		}
		System.out.println("******************************");
		//break
		for(int i: arr2)
		{
			//if else loop
			
			if(i % 2 == 0)
			{
				System.out.println(i);
				break;
			}
			else
			{
				System.out.println(i + "not multiple of 2");
			}
			
			
		}
		System.out.println("******************************");
		//Array list- Dynamic array
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sri");
		a.add("mallik");
		a.add("Arjuna");
		a.add("Reddy");
		a.add("Mettu");
		a.remove(1);
		
		System.out.println(a.get(1));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("******************************");
		for(String i:a)
		{
			System.out.println(i);
		}
		
		System.out.println("******************************");
		
		//item present in Array list
		
		System.out.println(a.contains("mallik"));
		System.out.println("******************************");
		//Convert Array to ArrayList
		String[] name = {"sri","mallik","arjuna","mettu"};
		
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("arjuna"));		
		System.out.println("******************************");

	}

}
