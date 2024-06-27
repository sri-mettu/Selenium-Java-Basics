package ekoms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

//ITestListener - interface which implements Testng listeners
public class Listeners implements ITestListener {
	 	 
	
	@Override
	public void onTestStart(ITestResult result) {
	  
	  }	  
	  
	@Override
	  public void onTestSuccess(ITestResult result) {
		//Invoked each time a test succeeds
		System.out.println("ITestListener-Success"+ result.getName());
	  }

	@Override
	  public void onTestFailure(ITestResult result) {
	    // Invoked each time a test fails.
		System.out.println("ITestListener-Failure"+ result.getName());
	  }

	@Override
	  public void onTestSkipped(ITestResult result) {
	    // Invoked each time a test is skipped.
	  }

	@Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // Invoked each time a method fails but has been annotated with successPercentage and this failure
	  }
	  
	@Override
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    //Invoked each time a test fails due to a timeout.
	  }

	@Override
	  public void onStart(ITestContext context) {
	    // Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
		   //and calling all their Configuration methods
	  }

	@Override
	  public void onFinish(ITestContext context) {
	    // Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
		//and all their Configuration methods have been called.
	  }
	}

