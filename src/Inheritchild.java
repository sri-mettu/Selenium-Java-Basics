import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inheritchild extends Inheritparent{
	
	@Test
	public void clogin() throws InterruptedException {
		
		Inheritchild2 c2=new Inheritchild2(5);//Parameterized Constructor
		int i=5;
		plogin();	//parent
		
		System.out.println(c2.increment());
		System.out.println(c2.decrement());
		System.out.println(c2.multiply1());
		System.out.println(c2.multiply2());
	}
	
}
