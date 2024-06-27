

public class Inheritchild2 extends Inheritencechild3{
	int i;
	
	public Inheritchild2(int i) {
		super(i); //Super Keyword
		this.i=i;
	}
	
	//Default Constructor

	public int increment() {
		
		i=i+1;
		return i;
	}
	
	public int decrement() {
		i=i-1;
		return i;
	}

}
