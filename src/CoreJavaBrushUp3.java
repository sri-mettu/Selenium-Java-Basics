
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object//String Literal- duplicate values are ignored
		
		String s = "Sri";
		String s1 = "Mallik";
		
		//New- can create duplicate values
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		//split
		String N = "Sri Mallik Mettu";
		String[] splittedN = N.split(" ");
		System.out.println(splittedN[0]);
		System.out.println(splittedN[1]);
		System.out.println(splittedN[2]);
		
		String[] splitN = N.split("Mallik");
		System.out.println(splitN[0]);
		System.out.println(splitN[1]);
		System.out.println(splitN[1].trim());//Trim
		
		//Split Individual Character
		
		for(int i=0;i<N.length();i++)
		{
			System.out.println(N.charAt(i));
		}
		
		System.out.println("*********************************");
		//Reverse iterate
		for(int i=N.length()-1;i>=0;i--)
		{
			System.out.println(N.charAt(i));
		}
		
	}

}
